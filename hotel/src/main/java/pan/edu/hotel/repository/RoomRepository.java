package pan.edu.hotel.repository;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create repository for Room model
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import pan.edu.hotel.model.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
}
