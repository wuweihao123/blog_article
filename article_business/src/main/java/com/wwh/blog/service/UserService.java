package com.wwh.blog.service;


import com.wwh.blog.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;

public interface UserService {
    void addUser(User user);

    User getUser(String username);

}
