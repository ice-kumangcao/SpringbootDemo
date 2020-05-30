package com.ice.hibernate.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public interface BaseDao {
    /**
     * session
     * @return
     */
    Session session();
    /**
     * get Template
     * @return
     */
    HibernateTemplate getTemplate();

    /**
     * find by hql
     * @param sql
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> List<T> findBySql(String sql, Class<T> entityClass);
}
