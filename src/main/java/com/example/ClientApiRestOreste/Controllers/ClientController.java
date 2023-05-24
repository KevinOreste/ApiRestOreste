package com.example.ClientApiRestOreste.Controllers;

import com.example.ClientApiRestOreste.DTOs.ClientDTO;
import com.example.ClientApiRestOreste.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/v1/client")
public class ClientController {

    @Autowired
    public ClientService clientService;

    @GetMapping (path = "{id}")

        public ClientDTO getClientById(@PathVariable int id){

        try {
             return clientService.getClientById(id);

        } catch (Exception e) {

            e.printStackTrace();
             return null;
        }

    }


}
