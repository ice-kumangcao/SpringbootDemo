package com.ice.hibernate.dao.impl;

import com.ice.hibernate.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository("baseDaoImpl")
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

    @Autowired
    public void setCustomSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
    @Override
    public Session session() {
        return this.currentSession();
    }

    @Override
    public HibernateTemplate getTemplate() {
        return this.getHibernateTemplate();
    }

    @Override
    public <T> List<T> findBySql(String sql) throws Exception {
        try {
            return session().createQuery(sql).list();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
