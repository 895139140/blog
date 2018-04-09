package cn.nf.zsx.blog.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.nf.zsx.blog.dao.CommentDao;
import cn.nf.zsx.blog.domin.Comment;
import cn.nf.zsx.blog.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.nf.zsx.blog.domin.PageBean;

/**
 * @Description 实现评论service接口
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Resource
	private CommentDao commentDao;

	public PageBean<Comment> listByPage(PageBean<Comment> pageBean) {
		pageBean.getMap().put("start", pageBean.getStart());
		pageBean.getMap().put("end", pageBean.getEnd());
		pageBean.setResult(commentDao.listByPage(pageBean.getMap()));
		pageBean.setTotal(commentDao.getTotal(pageBean.getMap()));
		return pageBean;
	}

	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	public Comment getById(Integer id) {
		return commentDao.getById(id);
	}

	@Transactional
	public Integer saveComment(Comment comment) {
		return commentDao.saveComment(comment);
	}

	@Transactional
	public Integer deleteComment(Integer id) {
		return commentDao.deleteComment(id);
	}

	@Transactional
	public Integer updateComment(Comment comment) {
		return commentDao.updateComment(comment);
	}

	@Transactional
	public Long deleteCommentByBlogId(Integer blogId) {
		return commentDao.deleteCommentByBlogId(blogId);
	}

	@Deprecated
	public List<Comment> getCommentData(Map<String, Object> map) {
		return commentDao.listByPage(map);
	}

	@Override
	public List<Comment> queryCommentsByBlogId(Integer blogId) {
		return commentDao.queryByBlogId(blogId);
	}

	@Override
	public List<Comment> listComment(Map<String, Object> map) {
		return commentDao.listByPage(map);
	}
}
