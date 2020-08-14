package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;

import java.util.List;
@RequestMapping("/api/cafedra")
@RestController
public class CafedraRestController {

    @Autowired
    CafedraServiceImpl cafedraService;


    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Web Controller</h1>";
    }


    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList(){
        return cafedraService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id){
        return cafedraService.get(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    Cafedra deleteCafedra(@PathVariable("id") String id){
        return cafedraService.delete(id);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)

    Cafedra createCafedra(@RequestBody Cafedra cafedra){
        return cafedraService.create(cafedra);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Cafedra updateCafedra(@RequestBody Cafedra cafedra){
        return cafedraService.update(cafedra);
    }




}
