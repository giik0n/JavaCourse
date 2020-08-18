package pan.edu.welcome_spring.form;
/*
 * @author Alexander Panyshchev
 * @since 11.08.2020
 * @version 1.0
 */

import pan.edu.welcome_spring.model.Cafedra;

import java.util.Objects;

public class GroupForm {
    private String id;
    private String name;
    private String desc;
    private String cafedra;

    public GroupForm() {
    }

    public GroupForm(String name, String desc, String cafedra) {
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public GroupForm(String id, String name, String desc, String cafedra) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
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

    public String getCafedra() {
        return cafedra;
    }

    public void setCafedra(String chief) {
        this.cafedra = cafedra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupForm that = (GroupForm) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "GroupForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", chief='" + cafedra + '\'' +
                '}';
    }
}
