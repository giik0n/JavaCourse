package pan.edu.welcome_spring.service.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.dao.cafedra.impls.DaoCafedraImpl;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.interfaces.ICafedraService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

    @Autowired
    DaoCafedraImpl daoCafedra;

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
        return daoCafedra.getAll();
    }
}
