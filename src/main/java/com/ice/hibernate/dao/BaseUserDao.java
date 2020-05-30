package com.ice.hibernate.dao;

import org.springframework.stereotype.Repository;
import com.ice.hibernate.entity.BaseUser;

import java.util.List;

@Repository("baseUserDao")
public interface BaseUserDao {
    List<BaseUser> findByName(String name);
}
