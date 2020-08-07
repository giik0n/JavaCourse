package pan.edu.welcome_spring.service.group.interfaces;

import pan.edu.welcome_spring.model.Group;

import java.util.List;

public interface IGroupService {
    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();
}
