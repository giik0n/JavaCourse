package pan.edu.hotel.service.room.interfaces;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create interface for room service
 */

import pan.edu.hotel.model.Room;

import java.util.List;

public interface IRoomService {
    Room create(Room room);
    Room get(String id);
    Room delete(String id);
    Room update(Room room);
    List<Room> getAll();
}
