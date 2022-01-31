package ai.inside.domademo2.Service;

import ai.inside.domademo2.dao.PagesDao;
import ai.inside.domademo2.entity.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagesService {
    private final PagesDao pagesDao;
    public PagesService(PagesDao pagesDao) {
        this.pagesDao = pagesDao;
    }

    public List<Page> selectAll() {
        return pagesDao.selectAll();
    }

    public Page selectOne(Long id) {
        return pagesDao.selectById(id);
    }

    public Page create(Page.RegisterParam param, Long unitId) {
        Page page = new Page(param.getNo(), param.getName(), unitId);
        this.pagesDao.insert(page);
        return page;
    }

    public Page update(Long unitId, Long pageId, Page.UpdateParam param) {
        Page page = this.pagesDao.selectByUnitIdAndPageId(unitId, pageId);
        page.name = param.getName();
        this.pagesDao.update(page);
        return page;
    }

    public int delete(Long unitId, Long pageId) {
        Page page = this.pagesDao.selectByUnitIdAndPageId(unitId, pageId);
        return this.pagesDao.delete(page);
    }
}
