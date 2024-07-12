package com.example.cubochallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cubochallenge.dto.ClientDTO;
import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.repository.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(ClientDTO clientDTO) {
        Client client = new Client();

        if (clientDTO.firstName() == null || clientDTO.lastName() == null || clientDTO.participation() == null)
            throw new NullPointerException("This field is invalid, because it's null");

        client.setFirstName(clientDTO.firstName());
        client.setLastName(clientDTO.lastName());
        client.setParticipation(clientDTO.participation());

        return clientRepository.save(client);
    }
}
