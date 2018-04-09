package cn.nf.zsx.blog.service;

import cn.nf.zsx.blog.domin.Blogger;

/**
 * @Description 博主service接口
 */

public interface BloggerService {
    /**
     * 查询博主信息
     * @return
     */
    Blogger getBloggerData();

    /**
     * 通过用户名查询博主信息
     * @param username
     * @return
     */
    Blogger getBloggerByName(String username);

    /**
     * 更新博主信息
     * @param blogger
     * @return
     */
    Integer updateBlogger(Blogger blogger);
    
}
