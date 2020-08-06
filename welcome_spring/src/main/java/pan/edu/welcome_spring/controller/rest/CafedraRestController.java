package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;

import java.util.List;

@RestController
public class CafedraRestController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/cafedra/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList(){
        return cafedraService.getAll();
    }
}
