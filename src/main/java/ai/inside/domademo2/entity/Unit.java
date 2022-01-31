package ai.inside.domademo2.entity;

import org.seasar.doma.*;

import java.io.Serializable;

@Entity
@Table(name = "units")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public Unit() {}
    public Unit(String name) {
        this.name = name;
    }

    public static class RegisterParam {
        private String name;
        public RegisterParam() {}
        public RegisterParam(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static class UpdateParam {
        private String name;
        public UpdateParam() {}
        public UpdateParam(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}

