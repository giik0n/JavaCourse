package pan.edu.welcome_spring.repository;
/*
 * @author Alexander Panyshchev
 * @since 07.08.2020
 * @version 1.0
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import pan.edu.welcome_spring.model.Group;

public interface GroupRepository extends MongoRepository<Group, String> {
}
