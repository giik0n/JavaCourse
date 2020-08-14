package pan.edu.mysqltesting.demo;    /*
 * @author Alexander Panyshchev
 * @since 14.08.2020
 * @version 1.0
 *Task:
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
