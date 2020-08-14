package pan.edu.hotel.model;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: Create model for hotel settlements
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Document
public class Settlement {
    @Id
    private String settlementId;//id for database
    private String description;// record description
    private LocalDateTime createdAt;// record creation date
    private LocalDateTime updatedAt;// record updating date

    private List<String> clientId;
    private String roomId;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private String comment;

    public Settlement() {
    }

    public Settlement(List<String> clientId, String roomId, LocalDateTime checkInDate, LocalDateTime checkOutDate,
                      String comment) {
        this.clientId = clientId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.comment = comment;
    }

    public Settlement(String settlementId, List<String> clientId, String roomId, LocalDateTime checkInDate,
                      LocalDateTime checkOutDate, String comment) {
        this.settlementId = settlementId;
        this.clientId = clientId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.comment = comment;
    }

    public Settlement(String settlementId, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                      List<String> clientId, String roomId, LocalDateTime checkInDate, LocalDateTime checkOutDate, String comment) {
        this.settlementId = settlementId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.clientId = clientId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.comment = comment;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
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

    public List<String> getClientId() {
        return clientId;
    }

    public void setClientId(List<String> clientId) {
        this.clientId = clientId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDateTime checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
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
        Settlement that = (Settlement) o;
        return settlementId.equals(that.settlementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settlementId);
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "settlementId='" + settlementId + '\'' +
                ", clientId=" + clientId +
                ", roomId='" + roomId + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
