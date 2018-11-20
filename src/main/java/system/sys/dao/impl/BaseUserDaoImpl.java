package system.sys.dao.impl;

import common.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.sys.dao.BaseUserDao;
import system.sys.entity.BaseUser;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository("baseUserDaoImpl")
public class BaseUserDaoImpl implements BaseUserDao {

    @Autowired
    private BaseDao baseDao;

    BaseDao getBaseDao() {
        return baseDao;
    }

    @Override
    public List<BaseUser> findByName(final String name) {
        String hql = "from BaseUser where username = '1'";
        try {
            return baseDao.findBySql(hql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
