package com.ice.hibernate.dao.impl;

import com.ice.hibernate.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ice.hibernate.dao.UserDao;
import com.ice.hibernate.entity.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    private final BaseDao baseDao;

    public UserDaoImpl(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<User> findByName(String name) {
        String hql = String.format(" from User where username='%s'", name);
        return baseDao.findBySql(hql, User.class);
    }
}
