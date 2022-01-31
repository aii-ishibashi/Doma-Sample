package ai.inside.domademo2.controller;

import ai.inside.domademo2.Service.UnitsService;
import ai.inside.domademo2.entity.Unit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UnitsController {
    private final UnitsService unitsService;
    public UnitsController(UnitsService unitsService) {
        this.unitsService = unitsService;
    }

    @GetMapping("/units")
    public List<Unit> selectAll() {
        return this.unitsService.selectAll();
    }

    @GetMapping("/units/{id}")
    public Unit selectOne(@PathVariable Long id) {
        return this.unitsService.selectOne(id);
    }

    @PostMapping("/units")
    public Unit create(@RequestBody Unit.RegisterParam param) {
        return this.unitsService.create(param);
    }

    @PutMapping("/units/{id}")
    public Unit update(@PathVariable Long id, @RequestBody Unit.UpdateParam param) {
        return this.unitsService.update(id, param);
    }

    @DeleteMapping("/units/{id}")
    public int delete(@PathVariable Long id) {
        return this.unitsService.delete(id);
    }
}
