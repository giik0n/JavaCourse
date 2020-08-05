package com.panischev.mentoring;

import com.panischev.mentoring.model.House;
import com.panischev.mentoring.service.HouseService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Application {
    @Autowired
    private HouseService houseService;

    public void execute() {
        House domNeChuvaka = new House("ASDASDASDASD", Arrays.asList("NE CHUVAK"));
        System.out.println(houseService.findAllPersonsWhoOwnTheHouse(domNeChuvaka));
    }
}
