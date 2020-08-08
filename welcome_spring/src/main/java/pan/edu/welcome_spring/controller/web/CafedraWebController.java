package pan.edu.welcome_spring.controller.web;
/*
 * @author Alexander Panyshchev
 * @since 08.08.2020
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
