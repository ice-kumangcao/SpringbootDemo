package system.sys.dao;

import org.springframework.stereotype.Repository;
import system.sys.entity.BaseUser;

import java.util.List;

@Repository("baseUserDao")
public interface BaseUserDao {
    List<BaseUser> findByName(String name);
}
