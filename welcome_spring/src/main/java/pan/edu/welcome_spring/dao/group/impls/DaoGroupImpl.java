package pan.edu.welcome_spring.dao.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.dao.group.interfaces.IDaoGroup;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Group;

import java.util.List;

@Repository
public class DaoGroupImpl implements IDaoGroup {

    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Group group) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public Group update(Group group) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return dataFake.getGroups();
    }
}
