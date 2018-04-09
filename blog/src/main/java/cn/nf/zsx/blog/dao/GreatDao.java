package cn.nf.zsx.blog.dao;

import org.apache.ibatis.annotations.Param;

import cn.nf.zsx.blog.domin.Great;

public interface GreatDao {

	/**
	 * 新增图片
	 * 
	 * @param Picture
	 * @return
	 */
	public Integer addGreat(Great great);

	/**
	 * 删除图片
	 * 
	 * @param id
	 * @return
	 */
	public Integer deleteGreat(Integer id);

	/**
	 * 查看是否有imageId------>用户ip的关系
	 * 
	 * @param userIp
	 * @param imageId
	 * @return
	 */
	public Great getByUserIpAndImageId(@Param("userIp") String userIp,
			@Param("imageId") Integer imageId);
}
