package com.bjpowernode.service;

import com.bjpowernode.pojo.Admin;

/**
 * @Author hongxiaobin
 * @Time 2022/9/3-15:39
 */
public interface AdminService {
    /**
     * 完成登录判断
     *
     * @Param:
     * @Return:
     */
    Admin login(String name, String pwd);
}
