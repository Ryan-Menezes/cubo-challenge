package com.example.cubochallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cubochallenge.dto.ClientDTO;
import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> clients = clientService.findAll();

        return ResponseEntity.ok(clients);
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody ClientDTO clientDTO) {
        Client client = clientService.save(clientDTO);

        return ResponseEntity.ok(client);
    }
}
