package pan.edu.hotel.controller.rest;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create REST controller for client model
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.edu.hotel.model.Client;
import pan.edu.hotel.service.client.impls.ClientServiceImpl;

import java.util.List;

@RequestMapping("/api/client")
@RestController
public class ClientRestController {
    @Autowired
    ClientServiceImpl clientService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client createClient(@RequestBody Client client){
        return clientService.create(client);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Client> createClient(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Client deleteClient(@PathVariable("id") String id){
        return clientService.delete(id);
    }

}
