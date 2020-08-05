package com.panischev.mentoring.service;

import com.panischev.mentoring.model.House;
import com.panischev.mentoring.model.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    private List<House> houses;
    @Autowired
    private PersonService personService;

    @PostConstruct
    public void fillHouses() {
        House domChuvaka = new House("ASD", Arrays.asList("CHUVAK", "NE CHUVAK"));
        House domNeChuvaka = new House("ASDASDASDASD", Arrays.asList("NE CHUVAK"));
        houses = Arrays.asList(domChuvaka, domNeChuvaka);
    }

    public List<Person> findAllPersonsWhoOwnTheHouse(House house) {
        return personService.getPersonList()
                .stream()
                .filter(p -> house.getOwnerNames().contains(p.getName()))
                .collect(Collectors.toList());
    }
}
