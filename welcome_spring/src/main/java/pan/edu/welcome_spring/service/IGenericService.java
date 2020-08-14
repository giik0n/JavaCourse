package pan.edu.welcome_spring.service;
/*
 * @author Alexander Panyshchev
 * @since 14.08.2020
 * @version 1.0
 *Task: create generic interface
 */

import pan.edu.welcome_spring.model.Cafedra;

import java.util.List;

public interface IGenericService<T>{
    T create(T t);
    T get(String id);
    T delete(String id);
    T update(T t);
    List<T> getAll();
}
