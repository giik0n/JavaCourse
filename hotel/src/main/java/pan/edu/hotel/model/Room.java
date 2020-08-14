package pan.edu.hotel.model;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: Create model for hotel rooms
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Room {
    @Id
    private String roomId;//id for database
    private String description;// record description
    private LocalDateTime createdAt;// record creation date
    private LocalDateTime updatedAt;// record updating date

    private String roomNumber;
    private int roomCapacity;
    private String comfort;
    private double price;

    public Room() {
    }

    public Room(String roomNumber, int roomCapacity, String comfort, double price) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.comfort = comfort;
        this.price = price;
    }

    public Room(String roomId, String roomNumber, int roomCapacity, String comfort, double price) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.comfort = comfort;
        this.price = price;
    }

    public Room(String roomId, String description, LocalDateTime createdAt, LocalDateTime updatedAt, String roomNumber,
                int roomCapacity, String comfort, double price) {
        this.roomId = roomId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.comfort = comfort;
        this.price = price;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId.equals(room.roomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", comfort='" + comfort + '\'' +
                ", price=" + price +
                '}';
    }
}
