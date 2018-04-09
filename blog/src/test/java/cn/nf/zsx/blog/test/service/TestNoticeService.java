package cn.nf.zsx.blog.test.service;

import java.util.Date;
import java.util.List;

import cn.nf.zsx.blog.Application;
import cn.nf.zsx.blog.dao.NoticeDao;
import cn.nf.zsx.blog.domin.Notice;
import cn.nf.zsx.blog.service.NoticeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description： 公共的CRUD+分页+遍历接口
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestNoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Autowired
	NoticeService noticeService;

	@Test
	public void getNoticeById() throws Exception {
		Notice notice = noticeDao.getNoticeById(24);
		System.out.println("打印：" + notice.toString());
	}

	@Test
	public void TestNoticeUpdate() {
		Notice notice = noticeDao.getNoticeById(24);
		notice.setContent("饿呢！");
		noticeService.updateNotice(notice);
		System.out.println(noticeDao.getNoticeById(24).toString());
	}

	@Test
	public void TestNoticeAdd() {
		Notice notice = new Notice();
		notice.setContent("很重要公告");
		notice.setLevel(2);
		notice.setNoticeDate(new Date());
		notice.setNoticePublisher("自己");
		noticeService.saveNotice(notice);
	}

	@Test
	public void TestNoticeDelete() {
		int i = noticeService.deleteByNoticeId(5);
		System.out.println(i == 1); // true;
	}

	@Test
	public void getAllNotices() {
		List<Notice> list = noticeService.getAllNotices();
		for (Notice notice : list) {
			System.out.println(notice.toString());
		}
	}
}
