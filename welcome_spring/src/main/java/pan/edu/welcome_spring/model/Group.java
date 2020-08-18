package pan.edu.welcome_spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Group {
    @Id
    private String id;
    private String name;
    private String desc;
    private Cafedra cafedra;
    private LocalDateTime createdAt, updatedAt;

    public Group() {//пустой конструктор
    }

    public Group(String name, String desc, Cafedra cafedra) {//без id, createdAt, updatedAt
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra) {//без, createdAt, updatedAt
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }//полный коструктор

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

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", cafedra=" + cafedra +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
