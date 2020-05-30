package com.ice.hibernate.controller;

import com.ice.hibernate.dao.UserDao;
import com.ice.hibernate.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api("用户管理")
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/getUser")
    @ApiOperation("test")
    public List<User> test(String username){
        return userDao.findByName(username);
    }
}
