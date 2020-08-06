package pan.edu.welcome_spring.datastorage;

import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Cafedra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("1","IPZ","Ivanov","Engineering"),
            new Cafedra("2","KN","Petrol","MSOffice"),
            new Cafedra("3","IT","Pshek","VojtiVIT")
    ));

    public List<Cafedra> getCafedras() {
        return cafedras;
    }

    public void setCafedras(List<Cafedra> cafedras) {
        this.cafedras = cafedras;
    }
}
