package com.skilldistillery.dndcharacterjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.skilldistillery.dndcharacterjpa"})
public class BootDndCharacterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDndCharacterApplication.class, args);
	}

}
