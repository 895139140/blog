package cn.nf.zsx.blog.service;

import org.apache.ibatis.annotations.Param;

import cn.nf.zsx.blog.domin.Great;

/**
 *
 * @Description： 点赞服务接口
 * 
 */
public interface GreatService {
	/**
	 * 新增图片
	 * 
	 * @param Picture
	 * @return
	 */
	public Integer saveGreat(Great great);

	/**
	 * 删除图片
	 * 
	 * @param id
	 * @return
	 */
	public Integer delGreat(Integer id);

	/**
	 * 查看是否有imageId------>用户ip的关系
	 * 
	 * @param userIp
	 * @param imageId
	 * @return
	 */
	public Great isClick(@Param("userIp") String userIp,
			@Param("imageId") Integer imageId);
}
