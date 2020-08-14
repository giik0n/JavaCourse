package pan.edu.hotel.service.client.impls;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: implement client service
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.hotel.model.Client;
import pan.edu.hotel.repository.ClientRepository;
import pan.edu.hotel.service.client.interfaces.IClientService;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        client.setCreatedAt(LocalDateTime.now());
        client.setUpdatedAt(LocalDateTime.now());
        return clientRepository.save(client);
    }

    @Override
    public Client get(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client delete(String id) {
        Client client = this.get(id);
        clientRepository.deleteById(id);
        return client;
    }

    @Override
    public Client update(Client client) {
        client.setUpdatedAt(LocalDateTime.now());
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

}
