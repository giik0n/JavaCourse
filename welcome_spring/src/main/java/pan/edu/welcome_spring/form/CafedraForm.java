package pan.edu.welcome_spring.form;
/*
 * @author Alexander Panyshchev
 * @since 11.08.2020
 * @version 1.0
 */

import java.util.Objects;

public class CafedraForm {
    private String id;
    private String name;
    private String desc;
    private String chief;

    public CafedraForm() {
    }

    public CafedraForm(String name, String desc, String chief) {
        this.name = name;
        this.desc = desc;
        this.chief = chief;
    }

    public CafedraForm(String id, String name, String desc, String chief) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.chief = chief;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafedraForm that = (CafedraForm) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CafedraForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }
}
