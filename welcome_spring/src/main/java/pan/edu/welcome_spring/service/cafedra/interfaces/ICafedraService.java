package pan.edu.welcome_spring.service.cafedra.interfaces;

import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.IGenericService;

import java.util.List;

public interface ICafedraService extends IGenericService<Cafedra> {
    List <Cafedra> searchByName(String name);
    List <Cafedra> searchByString(String str);
}
