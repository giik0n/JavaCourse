package pan.edu.welcome_spring.service.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.repository.CafedraRepository;
import pan.edu.welcome_spring.service.cafedra.interfaces.ICafedraBusiness;
import pan.edu.welcome_spring.service.cafedra.interfaces.ICafedraService;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CafedraServiceImpl implements ICafedraService, ICafedraBusiness {

    /*@Autowired
    DaoCafedraImpl daoCafedra;*/

    @Autowired
    CafedraRepository cafedraRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public List<Cafedra> getAll() {
        return cafedraRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }

    @Override
    public List<Cafedra> searchByName(String str) {
        /*return this.getAll()
                .stream()
                .filter(item -> item.getName().equals(str))
                .collect(Collectors.toList());*/
        return cafedraRepository.findAllByName(str);
    }

    @Override
    public List<Cafedra> searchByString(String str) {
        return this.getAll()
                .stream()
                .filter(item -> item.getName().contains(str))
                .collect(Collectors.toList());
    }

    @Override
    public Cafedra findTheBestCafedra() {
        return null;
    }

    @Override
    public List<Cafedra> sortByName(String name, String order) {
        return this.getAll()
                .stream()
                .sorted(Comparator.comparing(Cafedra::getName).reversed())
                .collect(Collectors.toList());
    }

}
