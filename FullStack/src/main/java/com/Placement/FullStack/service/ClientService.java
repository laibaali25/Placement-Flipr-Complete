package com.Placement.FullStack.service;

import java.util.List;

import com.Placement.FullStack.model.Client;

public interface ClientService {
    List<Client> getAllClients();
    Client saveClient(Client client);
}
