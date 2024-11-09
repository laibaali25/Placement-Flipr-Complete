// package com.Placement.FullStack.controller;

// import org.springframework.web.bind.annotation.*;
// import com.Placement.FullStack.model.Client;
// import com.Placement.FullStack.service.ClientService;

// import java.util.List;

// @RestController
// @RequestMapping("/api/clients")
// public class ClientController {
//     private final ClientService clientService;

//     public ClientController(ClientService clientService) {
//         this.clientService = clientService;
//     }

//     @GetMapping
//     public List<Client> getAllClients() {
//         return clientService.getAllClients();
//     }

//     @PostMapping
//     public Client saveClient(@RequestBody Client client) {
//         return clientService.saveClient(client);
//     }
// }


// ClientController.java
package com.Placement.FullStack.controller;

import org.springframework.web.bind.annotation.*;
import com.Placement.FullStack.model.Client;
import com.Placement.FullStack.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientService clientService;

    // Constructor injection, Spring will inject the ClientService automatically
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();  // Call service to get all clients
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);  // Call service to save client
    }
}
