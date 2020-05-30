package com.ice.hibernate.dao;

import com.ice.hibernate.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findByName(String name);
}
