package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.AdminMapper;
import com.bjpowernode.pojo.Admin;
import com.bjpowernode.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hongxiaobin
 * @Time 2022/9/3-15:40
 */
@Service
public class AdminServiceImpl implements AdminService {
    /**
     * 完成登录判断
     *
     * @param name
     * @param pwd
     * @Param:
     * @Return:
     */
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {

        return null;
    }
}
