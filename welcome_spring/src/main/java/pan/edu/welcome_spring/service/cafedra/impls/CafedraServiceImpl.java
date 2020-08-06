package pan.edu.welcome_spring.service.cafedra.impls;

import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.interfaces.ICafedraService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CafedraService implements ICafedraService {

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ","Ivanov","Engineering"),
            new Cafedra("KN","Petrol","MSOffice"),
            new Cafedra("IT","Pshek","VojtiVIT")
    ));

    @Override
    public Cafedra create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra get(String id) {
        return null;
    }

    @Override
    public Cafedra delete(String id) {
        return null;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        return null;
    }

    @Override
    public List<Cafedra> getAll() {
        return cafedras;
    }
}
