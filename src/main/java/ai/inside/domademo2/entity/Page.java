package ai.inside.domademo2.entity;

import org.seasar.doma.*;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "pages")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public int no;

    public String name;

    public Long unitId;

    public Page(){}
    public Page(int no, String name, Long unitId) {
        this.no = no;
        this.name = name;
        this.unitId = unitId;
    }


    public static class RegisterParam {
        private int no;
        private String name;
        public RegisterParam() {}
        public RegisterParam(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public int getNo() {
            return no;
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
