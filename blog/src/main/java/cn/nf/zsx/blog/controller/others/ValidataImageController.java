package cn.nf.zsx.blog.controller.others;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.nf.zsx.blog.commons.VaildataCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 验证码
 *
 */
@Deprecated
@Controller
@RequestMapping("/blog")
public class ValidataImageController {
	/**
	 * 响应验证码页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/validateCode")
	public String validateCode(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 设置响应的类型格式为图片格式
		response.setContentType("image/jpeg");
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		HttpSession session = request.getSession();
		VaildataCodeUtil vCode = new VaildataCodeUtil(120, 38, 5, 100);
		session.setAttribute("code", vCode.getCode());
		vCode.write(response.getOutputStream());
		return null;
	}
}
