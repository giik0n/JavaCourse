package pan.edu.welcome_spring.controller.web;
/*
 * @author Alexander Panyshchev
 * @since 08.08.2020
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.welcome_spring.form.CafedraForm;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping(value = "/get/list", method =RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list",cafedraService.getAll());
        return "cafedraList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        cafedraService.delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getCafedraInfo(@PathVariable("id") String id, Model model){
        Cafedra cafedra = cafedraService.get(id);
        model.addAttribute("list",cafedraService.getAll());
        model.addAttribute("info", cafedra.toString());
        return "redirect:/web/cafedra/get/list";
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase(){
        cafedraService.reloadDatabase();
        return "redirect:/web/cafedra/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCafedra(Model model){
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "addCafedra";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedraForm.getName());
        cafedra.setDesc(cafedraForm.getDesc());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.create(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCafedra(@PathVariable("id") String id,Model model) {
        Cafedra cafedra = cafedraService.get(id);
        CafedraForm cafedraForm = new CafedraForm(
                cafedra.getId(),
                cafedra.getName(),
                cafedra.getDesc(),
                cafedra.getChief()
        );
        model.addAttribute("cafedraForm", cafedraForm);
        return "updateCafedra";
    }
        @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
        public String updateCafedra(Model model,@PathVariable("id") String id, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
            Cafedra cafedra = new Cafedra();
            cafedra.setId(id);
            cafedra.setName(cafedraForm.getName());
            cafedra.setDesc(cafedraForm.getDesc());
            cafedra.setChief(cafedraForm.getChief());
            cafedraService.update(cafedra);

            model.addAttribute("cafedras", cafedraService.getAll());
            return "redirect:/web/cafedra/get/list";
        }

}
