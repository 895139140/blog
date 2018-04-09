package cn.nf.zsx.blog.serviceImpl;

import cn.nf.zsx.blog.dao.GreatDao;
import cn.nf.zsx.blog.domin.Great;
import cn.nf.zsx.blog.service.GreatService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @Description： 点赞service实现
 * 
 */
@Service
public class GreatServiceImpl implements GreatService {

	@Autowired
	private GreatDao greatDao;

	@Override
	public Integer saveGreat(Great great) {
		return greatDao.addGreat(great);
	}

	@Override
	public Integer delGreat(Integer id) {
		return greatDao.deleteGreat(id);
	}

	@Override
	public Great isClick(@Param("userIp") String userIp,
			@Param("imageId") Integer imageId) {
		return greatDao.getByUserIpAndImageId(userIp, imageId);
	}

}
