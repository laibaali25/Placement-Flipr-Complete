package com.Placement.FullStack.service.impl;
// ClientServiceImpl.java


import com.Placement.FullStack.model.Client;
import com.Placement.FullStack.service.ClientService;
import com.Placement.FullStack.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // This marks the class as a Spring service, so it will be treated as a Spring Bean
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired  // Constructor injection of the repository
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();  // Assuming you have a repository to fetch clients from DB
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);  // Save client to the database
    }
}
