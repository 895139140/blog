package cn.nf.zsx.blog.service;

import java.util.List;

import cn.nf.zsx.blog.domin.Link;
import cn.nf.zsx.blog.domin.PageBean;

/**
 * @Description 友情链接service接口
 */
public interface LinkService {
    /**
     * 查询所有友情链接信息
     * @return
     */
    public List<Link> getTotalData();

    /**
     * 分页查询
     * @param pageBean
     * @return
     */
    public PageBean<Link> listByPage(PageBean<Link> pageBean);

    /**
     * 查询总记录数
     * @return
     */
    public Long getTotalCount();

    /**
     * 新增友情链接
     * @param link
     * @return
     */
    public Integer addLink(Link link);

    /**
     * 删除友情链接
     * @param id
     * @return
     */
    public Integer deleteLink(Integer id);

    /**
     * 更新友情链接
     * @param link
     * @return
     */
    public Integer updateLink(Link link);
}
