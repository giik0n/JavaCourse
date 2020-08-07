package pan.edu.welcome_spring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.model.Group;
import pan.edu.welcome_spring.repository.CafedraRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {
    @Autowired
    CafedraRepository cafedraRepository;

    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ","Ivanov","Engineering"),
            new Cafedra("KN","Petrol","MSOffice"),
            new Cafedra("IT","Pshek","VojtiVIT")
    ));

    //@PostConstruct
    private void init(){
        cafedraRepository.saveAll(cafedras);
    }

    private List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("1","543","ChNU",cafedras.get(0)),
            new Group("2","KN-42","UzhNU",cafedras.get(1)),
            new Group("3","6.04.51.15.01","KhNEU",cafedras.get(2))
    ));

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Cafedra> getCafedras() {
        return cafedras;
    }

    public void setCafedras(List<Cafedra> cafedras) {
        this.cafedras = cafedras;
    }
}
