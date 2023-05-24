package com.example.ClientApiRestOreste.Services;

import com.example.ClientApiRestOreste.DTOs.ClientDTO;
import com.example.ClientApiRestOreste.Models.Client;
import com.example.ClientApiRestOreste.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    public ClientDTO getClientById(int id) throws Exception{
        Optional<Client> client = clientRepository.findById(id);
        if(client.isEmpty()){
            throw new Exception();
        }else {
            ClientDTO clientDTO = new ClientDTO();
            clientDTO.setName(client.get().getName());
            clientDTO.setLastName(client.get().getLastName());
            clientDTO.setAge(Period.between(client.get().getBirthDate(), LocalDate.now()).getYears());

            return clientDTO;
        }
    }
}
