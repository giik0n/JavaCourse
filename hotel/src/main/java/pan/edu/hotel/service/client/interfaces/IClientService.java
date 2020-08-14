package pan.edu.hotel.service.client.interfaces;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create interface for client service
 */

import pan.edu.hotel.model.Client;

import java.util.List;

public interface IClientService {

    Client create(Client client);
    Client get(String id);
    Client delete(String id);
    Client update(Client client);
    List<Client> getAll();

}
