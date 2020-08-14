package pan.edu.welcome_spring.service.cafedra.interfaces;
/*
 * @author Alexander Panyshchev
 * @since 14.08.2020
 * @version 1.0
 *Task: create business interface
 */

import pan.edu.welcome_spring.model.Cafedra;

import java.util.List;

public interface ICafedraBusiness {
    Cafedra findTheBestCafedra();
    List <Cafedra> sortByName(String name, String order);
}
