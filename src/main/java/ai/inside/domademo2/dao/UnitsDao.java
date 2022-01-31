package ai.inside.domademo2.dao;

import ai.inside.domademo2.entity.Unit;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface UnitsDao {

    @Select
    List<Unit> selectAll();

    @Select
    Unit selectById(Long id);

    @Insert
    int insert(Unit unit);

    @Update
    int update(Unit unit);

    @Delete
    int delete(Unit unit);
}
