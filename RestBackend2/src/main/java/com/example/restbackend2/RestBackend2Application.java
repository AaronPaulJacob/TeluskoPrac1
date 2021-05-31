package com.example.restbackend2;

import com.example.model.User;
import com.example.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RestBackend2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestBackend2Application.class, args);
	}
	@Autowired
	private userRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Aaron","Jacob","aaron@jacob.com"));
		this.userRepository.save(new User("Albert","Kumar","albert@kumar.com"));
	}
}
