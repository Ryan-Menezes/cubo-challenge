package com.example.cubochallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cubochallenge.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
