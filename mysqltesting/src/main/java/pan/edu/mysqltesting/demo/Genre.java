package pan.edu.mysqltesting.demo;
/*
 * @author Alexander Panyshchev
 * @since 14.08.2020
 * @version 1.0
 *Task:
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private Long id;
    private String name, desc;

    public Genre() {
    }

    public Genre(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Genre(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
