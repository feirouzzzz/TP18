package ma.project.tp18client.controllers;

import ma.project.tp18client.entities.Client;
import ma.project.tp18client.repositories.ClientRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api") // Ajout d'un préfixe pour les routes
public class ClientController {

    private final ClientRepository clientRepo;

    @Autowired
    public ClientController(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    @GetMapping("/clients/{clientId}")
    public Client getClientById(@PathVariable("clientId") Long id) throws RuntimeException {
        return clientRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Aucun client trouvé avec l'ID: " + id));
    }
}
