package cn.nf.zsx.blog.test.service;

import cn.nf.zsx.blog.Application;
import cn.nf.zsx.blog.domin.Great;
import cn.nf.zsx.blog.service.GreatService;
import cn.nf.zsx.blog.service.PictureService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description： 图片接口单元测试类
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestGreatServiceImpl {
	@Autowired
    PictureService pictureService;

	@Autowired
	private GreatService greatService;

	@Test
	public void testIsClick() {
		greatService.isClick("111.25.5.1", 5);
	}

	@Test
	public void testAdd() {
		greatService.saveGreat(new Great(null, "195.5.5.8", 55));
	}

	@Test
	public void testDelete() {
		greatService.delGreat(1);
	}

}
