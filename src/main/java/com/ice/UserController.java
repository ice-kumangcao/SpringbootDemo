package com.ice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import system.sys.dao.BaseUserDao;
import system.sys.entity.BaseUser;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BaseUserDao baseUserDao;

    @RequestMapping("/a")
    public void test(){
        List<BaseUser> users = baseUserDao.findByName("1");
        for (BaseUser user:users) {
            System.out.println(user.getRealname());
        }
    }
}
