package dev.sagar.insurance.service;

import dev.sagar.insurance.dto.ClientDTO;
import dev.sagar.insurance.model.Client;
import dev.sagar.insurance.repository.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + id));
    }

    public Client createClient(ClientDTO clientDTO) {
        Client client = new Client();
        client.setName(clientDTO.name());
        client.setDateOfBirth(clientDTO.dateOfBirth());
        client.setAddress(clientDTO.address());
        client.setContactInformation(clientDTO.contactInformation());
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, ClientDTO clientDTO) {
        Client existingClient = getClientById(id);
        existingClient.setName(clientDTO.name());
        existingClient.setDateOfBirth(clientDTO.dateOfBirth());
        existingClient.setAddress(clientDTO.address());
        existingClient.setContactInformation(clientDTO.contactInformation());
        return clientRepository.save(existingClient);
    }

    public void deleteClient(Long id) {
        Client client = getClientById(id);
        clientRepository.delete(client);
    }
}
