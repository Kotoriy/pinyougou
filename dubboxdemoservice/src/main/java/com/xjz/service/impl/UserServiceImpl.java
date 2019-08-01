package com.xjz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xjz.service.UserService;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{
    @Override
    public String getName() {
        return "hello dubbox";
    }
}
