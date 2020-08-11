package pan.edu.welcome_spring.service.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.dao.cafedra.impls.DaoCafedraImpl;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.repository.CafedraRepository;
import pan.edu.welcome_spring.service.cafedra.interfaces.ICafedraService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

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
}
