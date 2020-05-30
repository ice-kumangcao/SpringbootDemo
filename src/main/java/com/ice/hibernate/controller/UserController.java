package com.ice.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ice.hibernate.dao.BaseUserDao;
import com.ice.hibernate.entity.BaseUser;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final BaseUserDao baseUserDao;

    public UserController(BaseUserDao baseUserDao) {
        this.baseUserDao = baseUserDao;
    }

    @RequestMapping("/a")
    public void test(){
        List<BaseUser> users = baseUserDao.findByName("1");
        for (BaseUser user:users) {
            System.out.println(user.getRealName());
        }
    }
}
