package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;

import java.util.List;

@RestController
public class CafedraRestController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/hello")
    String getHello(){
        return "<h1>Hello form Cafedra Controller</h1>";
    }

    @GetMapping("/cafedra/list")
    List<Cafedra> getCafedrasList(){
        return cafedraService.getAll();
    }
}
