package cn.nf.zsx.blog.service;

import cn.nf.zsx.blog.domin.PageBean;
import cn.nf.zsx.blog.domin.Picture;

/**
 *
 * @Description： 相册图片服务接口
 * 
 */
public interface PictureService {
	/**
	 * 查询所有图片信息，按照点赞排行
	 * 
	 * @return
	 */
//	List<Picture> getTotalData();

	/**
	 * 查询总记录数
	 * 
	 * @return
	 */
	Long getTotalCount();

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
	 * 分页查询
	 * 
	 * @param pageBean
	 * @return
	 */

	PageBean<Picture> listByPage(PageBean<Picture> pageBean);

	/**
	 * 根据id获取图片
	 * 
	 * @param id
	 * @return
	 */
	Picture getPictureByid(Integer id);
}
