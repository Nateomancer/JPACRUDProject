package com.skilldistillery.guitarcollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.guitarcollection")
public class BootGuitarProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGuitarProjectApplication.class, args);
	}

}
