package ai.inside.domademo2.dao;

import ai.inside.domademo2.entity.Page;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface PagesDao {

    @Select
    List<Page> selectAll();

    @Select
    Page selectById(Long id);

    @Select
    Page selectByUnitIdAndPageId(Long unitId, Long pageId);

    @Insert
    int insert(Page page);

    @Update
    int update(Page page);

    @Delete
    int delete(Page page);
}
