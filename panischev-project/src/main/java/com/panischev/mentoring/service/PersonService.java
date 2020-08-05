package com.panischev.mentoring.service;

import com.panischev.mentoring.model.Person;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private List<Person> personList;

    @PostConstruct
    public void fillPersonList(){
        Person chuvak = new Person("CHUVAK");
        Person nechuvak = new Person("NE CHUVAK");
        personList = Arrays.asList(chuvak, nechuvak);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
