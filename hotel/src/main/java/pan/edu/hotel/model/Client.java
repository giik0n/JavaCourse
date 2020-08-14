package pan.edu.hotel.model;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: Create model for hotel clients
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Client {
    @Id
    private String id;//id for database
    private String description;// record description
    private LocalDateTime createdAt;// record creation date
    private LocalDateTime updatedAt;// record updating date

    private String surname;
    private String name;
    private String patronymic;
    private String passport; //passport data
    private String comment;

    public Client() {
    }

    public Client(String surname, String name, String patronymic, String passport, String comment) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.passport = passport;
        this.comment = comment;
    }

    public Client(String clientId, String surname, String name, String patronymic, String passport, String comment) {
        this.id = clientId;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.passport = passport;
        this.comment = comment;
    }

    public Client(String clientId, String description, LocalDateTime createdAt, LocalDateTime updatedAt, String surname,
                  String name, String patronymic, String passport, String comment) {
        this.id = clientId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.passport = passport;
        this.comment = comment;
    }

    public Client(String description, LocalDateTime createdAt, LocalDateTime updatedAt, String surname, String name, String patronymic, String passport, String comment) {
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.passport = passport;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", passport='" + passport + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String toJSON(){
        return "{" +
                "\"clientiId\":" + null +
                ",\"description\":\"" + description+
                "\",\"createdAt\":\"" + createdAt.toString()+
                "\",\"updatedAt\":\"" + updatedAt.toString()+
                "\",\"surname\":\"" + surname+
                "\",\"name\":\"" + name+
                "\",\"patronymic\":\"" + patronymic+
                "\",\"passport\":\"" + passport+
                "\",\"comment\":\"" + comment+
                "\"}";
    }
}
