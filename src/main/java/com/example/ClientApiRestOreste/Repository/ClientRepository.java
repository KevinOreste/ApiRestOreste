package com.example.ClientApiRestOreste.Repository;

import com.example.ClientApiRestOreste.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
