package ai.inside.domademo2.Service;

import ai.inside.domademo2.dao.UsersDao;
import ai.inside.domademo2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersDao usersDao;
    public UsersService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public List<User> selectAll() {
        return usersDao.selectAll();
    }

    public User selectOne() {
        return usersDao.selectById(1L);
    }

    public User create() {
        User user = new User("nameAAA");
        this.usersDao.insert(user);
        return user;
    }

    public User update() {
        User user = this.usersDao.selectById(1L);
        user.name = "nameXXX";
        this.usersDao.update(user);
        return user;
    }

    public int delete() {
        User user = this.usersDao.selectById(1L);
        return this.usersDao.delete(user);
    }
}
