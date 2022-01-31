package ai.inside.domademo2.controller;

import ai.inside.domademo2.Service.PagesService;
import ai.inside.domademo2.Service.UnitsService;
import ai.inside.domademo2.entity.Page;
import ai.inside.domademo2.entity.Unit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PagesController {
    private final UnitsService unitsService;
    private final PagesService pagesService;
    public PagesController(UnitsService unitsService, PagesService pagesService) {
        this.unitsService = unitsService;
        this.pagesService = pagesService;
    }

    @GetMapping("/pages")
    public List<Page> selectAll() {
        return this.pagesService.selectAll();
    }

    @GetMapping("/pages/{id}")
    public Page selectOne(@PathVariable Long id) {
        return this.pagesService.selectOne(id);
    }

    @PostMapping("/units/{id}/pages")
    public Page create(@PathVariable Long id, @RequestBody Page.RegisterParam param) {
        Unit unit = this.unitsService.selectOne(id);
        return this.pagesService.create(param, unit.id);
    }

    @PutMapping("/units/{unitId}/pages/{pageId}")
    public Page update(@PathVariable Long unitId, @PathVariable Long pageId, @RequestBody Page.UpdateParam param) {
        return this.pagesService.update(unitId, pageId, param);
    }

    @DeleteMapping("/units/{unitId}/pages/{pageId}")
    public int delete(@PathVariable Long unitId, @PathVariable Long pageId) {
        return this.pagesService.delete(unitId, pageId);
    }
}
