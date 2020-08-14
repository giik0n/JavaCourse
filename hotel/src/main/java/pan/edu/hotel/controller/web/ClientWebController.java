package pan.edu.hotel.controller.web;    /*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create web controller for client model
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.hotel.service.client.impls.ClientServiceImpl;

@RequestMapping("/web/client")
@Controller
public class ClientWebController {

    @Autowired
    ClientServiceImpl clientService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list",clientService.getAll());
        return "clientList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteClientById(@PathVariable("id") String id, Model model){
        clientService.delete(id);
        model.addAttribute("list",clientService.getAll());
        return "redirect:/web/client/get/list";
    }
}
