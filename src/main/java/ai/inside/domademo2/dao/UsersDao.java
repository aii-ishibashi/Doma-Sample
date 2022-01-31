package ai.inside.domademo2.dao;

import ai.inside.domademo2.entity.User;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface UsersDao {

    @Select
    List<User> selectAll();

    @Select
    User selectById(Long id);

    @Insert
    int insert(User user);

    @Update
    int update(User user);

    @Delete
    int delete(User user);
}
