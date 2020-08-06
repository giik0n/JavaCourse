package pan.edu.welcome_spring.dao.cafedra.interfaces;

import pan.edu.welcome_spring.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {
    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra delete(String id);
    Cafedra update(Cafedra cafedra);
    List<Cafedra> getAll();
}
