package cn.nf.zsx.blog.dao;

import java.util.List;
import java.util.Map;

import cn.nf.zsx.blog.domin.Picture;


public interface PictureDao {
	/**
	 * 查询所有图片信息，按照点赞排行
	 * 
	 * @return
	 */
//	List<Picture> getTotalData();

	/**
	 * 分页查询
	 * 
	 * @param pageBean
	 * @return
	 */

	List<Picture> listByPage(Map<String, Object> map);

	/**
	 * 查询总记录数
	 * 
	 * @return
	 */
	long getTotalCount();

	/**
	 * 新增图片
	 * 
	 * @param Picture
	 * @return
	 */
	Integer addPicture(Picture picture);

	/**
	 * 删除图片
	 * 
	 * @param id
	 * @return
	 */
	Integer deletePicture(Integer id);

	/**
	 * 更新图片
	 * 
	 * @param Picture
	 * @return
	 */
	Integer updatePicture(Picture picture);

	/**
	 * 根据id查询图片
	 * 
	 * @param id
	 * @return
	 */

	Picture getPictureById(Integer id);

}
