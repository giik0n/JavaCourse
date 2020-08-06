package pan.edu.welcome_spring.dao.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.dao.cafedra.interfaces.IDaoCafedra;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Cafedra;

import java.util.List;

@Repository
public class DaoCafedraImpl implements IDaoCafedra {

    @Autowired
    DataFake dataFake;

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
        return dataFake.getCafedras();
    }
}
