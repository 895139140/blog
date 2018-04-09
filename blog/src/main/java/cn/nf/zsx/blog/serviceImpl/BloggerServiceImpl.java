package cn.nf.zsx.blog.serviceImpl;

import javax.annotation.Resource;

import cn.nf.zsx.blog.service.BloggerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.nf.zsx.blog.dao.BloggerDao;
import cn.nf.zsx.blog.domin.Blogger;

/**
 * @Description 博主service实现类
 */
@Service
public class BloggerServiceImpl implements BloggerService {

	@Resource
	private BloggerDao bloggerDao;

	@Override
	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	@Override
	public Blogger getBloggerByName(String username) {
		return bloggerDao.getBloggerByName(username);
	}

	@Transactional
	@Override
	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBlogger(blogger);
	}
}
