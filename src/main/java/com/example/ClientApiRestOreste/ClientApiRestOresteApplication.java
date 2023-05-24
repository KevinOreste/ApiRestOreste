package com.example.ClientApiRestOreste;

import com.example.ClientApiRestOreste.Models.Client;
import com.example.ClientApiRestOreste.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Period;

@SpringBootApplication
public class ClientApiRestOresteApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(ClientApiRestOresteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening on. http://localhost:8888/h2-console");

		Client client1 = new Client();
		client1.setName("Kevin");
		client1.setLastName("Oreste");
		client1.setBirthDate(LocalDate.parse("2001-01-18"));
		this.clientRepository.save(client1);


		Client client2 = new Client();
		client2.setName("Iara");
		client2.setLastName("De Vita");
		client2.setBirthDate(LocalDate.parse("2003-08-12"));
		this.clientRepository.save(client2);

	}
}
