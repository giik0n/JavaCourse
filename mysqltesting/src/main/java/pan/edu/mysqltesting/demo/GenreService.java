package pan.edu.mysqltesting.demo;    /*
 * @author Alexander Panyshchev
 * @since 14.08.2020
 * @version 1.0
 *Task:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
@Service
public class GenreService {

    @Autowired
            GenreRepository genreRepository;
    List<Genre> genred = new LinkedList(Arrays.asList(
            new Genre("uzhasi", "really scary films"),
            new Genre("comedi", "such a funny videos"),
            new Genre("diocumental", "on the real facts")
    ));
    @PostConstruct
    public void init(){
        genreRepository.deleteAll();
        genreRepository.saveAll(genred);
        System.out.println(genreRepository.findAll().stream().count());
    }


}
