package com.ice.hibernate.controller;

import com.ice.hibernate.dao.UserDao;
import com.ice.hibernate.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/getUser")
    public void test(){
        List<User> users = userDao.findByName("1");
        for (User user:users) {
            System.out.println(user.getRealName());
        }
    }
}
