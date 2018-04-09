package cn.nf.zsx.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.nf.zsx.blog.domin.Message;
import cn.nf.zsx.blog.domin.PageBean;
import cn.nf.zsx.blog.service.MessageService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 *
 * @Description： 留言板的懒加载分页
 * 
 */
@RestController
@RequestMapping(value = "/blog/messageLazy")
public class MessageLazyController {


	private static final Logger log = org.slf4j.LoggerFactory
			.getLogger(MessageLazyController.class);
	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/list")
	public String listMessage(
			@RequestParam(value = "page", required = false) String page,
			HttpServletRequest httpServletRequest) {
		log.info("当前正在请求留言懒加载页面。。。");
		PageBean<Message> pageBean = new PageBean<>(Integer.parseInt(page), 10);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("state", 1);
		List<Message> messageList = messageService.listByMessages(map);
		pageBean.setResult(messageList);
		System.out.println(pageBean.getStart() + pageBean.getEnd());
		JSONObject result = new JSONObject();
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
		String jsonStr = JSONObject.toJSONString(pageBean.getResult(),
				SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.DisableCircularReferenceDetect);
		JSONArray jsonArray = JSON.parseArray(jsonStr);
		result.put("count", pageBean.getCount());
		result.put("total", pageBean.getTotal());
		result.put("currentPage", pageBean.getCurrPage());
		result.put("data", jsonArray);
		result.put("code", 0);// 封装接口，成功返回0
		return result.toJSONString();

	}

}
