package pan.edu.welcome_spring.model;

import java.time.LocalDateTime;

public class Group {
    private String id;
    private String name;
    private String desc;
    private Cafedra cafedra;
    private LocalDateTime createdAt, updatedAt;

    public Group() {
    }

    public Group(String name, String desc, Cafedra cafedra) {
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra) {
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
    }

}
