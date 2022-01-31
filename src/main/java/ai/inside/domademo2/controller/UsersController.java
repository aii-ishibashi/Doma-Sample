package ai.inside.domademo2.controller;

import ai.inside.domademo2.Service.UsersService;
import ai.inside.domademo2.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {
    private final UsersService usersService;
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<User> selectAll() {
        return this.usersService.selectAll();
    }

    @GetMapping("/users/{id}")
    public User selectOne() {
        return this.usersService.selectOne();
    }

    @PostMapping("/users")
    public User create() {
        return this.usersService.create();
    }

    @PutMapping("/users/{id}")
    public User update() {
        return this.usersService.update();
    }

    @DeleteMapping("/users/{id}")
    public int delete() {
        return this.usersService.delete();
    }
}
