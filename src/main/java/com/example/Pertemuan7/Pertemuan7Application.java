package com.example.Pertemuan7;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pertemuan7Application {

	public static void main(String[] args) {
		// Load .env variables from the root .env file
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		
		// Set system properties manually so Spring placeholders can resolve them
		dotenv.entries().forEach(entry -> {
			System.setProperty(entry.getKey(), entry.getValue());
		});

		SpringApplication.run(Pertemuan7Application.class, args);
	}

}
