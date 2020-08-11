package pan.edu.welcome_spring.controller.web;
/*
 * @author Alexander Panyshchev
 * @since 08.08.2020
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",cafedraService.getAll());
        return "cafedralist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        
        cafedraService.delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }
}
