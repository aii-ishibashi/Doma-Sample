package ai.inside.domademo2.Service;

import ai.inside.domademo2.dao.UnitsDao;
import ai.inside.domademo2.entity.Unit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitsService {
    private final UnitsDao unitsDao;
    public UnitsService(UnitsDao unitsDao) {
        this.unitsDao = unitsDao;
    }

    public List<Unit> selectAll() {
        return unitsDao.selectAll();
    }

    public Unit selectOne(Long id) {
        return unitsDao.selectById(id);
    }

    public Unit create(Unit.RegisterParam param) {
        Unit unit = new Unit(param.getName());
        this.unitsDao.insert(unit);
        return unit;
    }

    public Unit update(Long id, Unit.UpdateParam param) {
        Unit unit = this.unitsDao.selectById(id);
        unit.name = param.getName();
        this.unitsDao.update(unit);
        return unit;
    }

    public int delete(Long id) {
        Unit unit = this.unitsDao.selectById(id);
        return this.unitsDao.delete(unit);
    }

}
