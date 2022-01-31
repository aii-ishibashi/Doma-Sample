package ai.inside.domademo2.entity;

import org.seasar.doma.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    public User(){}

    public User(String name) {
        this. name = name;
    }
}
