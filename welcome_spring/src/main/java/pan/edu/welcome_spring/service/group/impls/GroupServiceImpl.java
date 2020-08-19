package pan.edu.welcome_spring.service.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.dao.group.impls.DaoGroupImpl;
import pan.edu.welcome_spring.model.Group;
import pan.edu.welcome_spring.repository.CafedraRepository;
import pan.edu.welcome_spring.repository.GroupRepository;
import pan.edu.welcome_spring.service.group.interfaces.IGroupService;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
@Service
public class GroupServiceImpl implements IGroupService {

   @Autowired
   GroupRepository groupRepository;

   @Autowired
    CafedraRepository cafedraRepository;

    List<Group> groups;

    @PostConstruct
    void init(){
        groups = new LinkedList<>(
                Arrays.asList(
                        new Group("1",
                                "KN-42",
                                "The best group in the world",
                                cafedraRepository.findAll().get(0)),

                        new Group("2",
                                "IPZ",
                                "Just group in the world",
                                cafedraRepository.findAll().get(1))));

        groupRepository.saveAll(groups);
    }
    @Override
    public Group create(Group group) {
        group.setCreatedAt(LocalDateTime.now());
        group.setUpdatedAt(LocalDateTime.now());
        return groupRepository.save(group);
    }

    @Override
    public Group get(String id) {
        return  groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group delete(String id) {
        groupRepository.deleteById(id);
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group update(Group group) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }


}
