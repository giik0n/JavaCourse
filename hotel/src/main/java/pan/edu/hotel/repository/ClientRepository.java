package pan.edu.hotel.repository;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create repository for Client model
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import pan.edu.hotel.model.Client;

public interface ClientRepository  extends MongoRepository<Client, String> {
}
