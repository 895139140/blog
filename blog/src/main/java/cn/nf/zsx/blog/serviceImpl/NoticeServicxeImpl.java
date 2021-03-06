package cn.nf.zsx.blog.serviceImpl;

import java.util.List;

import cn.nf.zsx.blog.dao.NoticeDao;
import cn.nf.zsx.blog.domin.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nf.zsx.blog.domin.PageBean;
import cn.nf.zsx.blog.service.NoticeService;

@Service
public class NoticeServicxeImpl implements NoticeService {
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public Integer deleteByNoticeId(Integer id) {
		return noticeDao.deleteByNoticeId(id);
	}

	@Override
	public Integer saveNotice(Notice notice) {
		return noticeDao.saveNotice(notice);
	}

	@Override
	public PageBean<Notice> listNotice(PageBean<Notice> pageBean) {
		pageBean.getMap().put("start", pageBean.getStart());
		pageBean.getMap().put("end", pageBean.getEnd());
		pageBean.setResult(noticeDao.listNotice(pageBean.getMap()));
		pageBean.setTotal(noticeDao.getTotal());
		return pageBean;
	}

	@Override
	public Integer updateNotice(Notice notice) {
		return noticeDao.updateNotice(notice);
	}

	@Override
	public Long getTotal() {
		return noticeDao.getTotal();
	}

	@Override
	public List<Notice> getAllNotices() {
		return noticeDao.getAllNotices();
	}

	@Override
	public Notice getNoticeById(Integer id) {
		return noticeDao.getNoticeById(id);
	}

}
