package pan.edu.welcome_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Cafedra;

import java.util.List;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra,String> {
    List<Cafedra> findAllByName(String name);
    List<Cafedra> findAllByNameAndDesc(String name, String desc);
    List<Cafedra> findAllByNameContains(String string);
    //Спать хочу!!!!!!
}
