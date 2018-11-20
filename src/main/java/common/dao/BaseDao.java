package common.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("baseDao")
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
    <T> List<T> findBySql(String sql) throws Exception;
}
