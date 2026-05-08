package com.example.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LocationApplication {

	public static void main(String[] args) {
		if(0==0){
			// testing failure for code-reviewer -2
			return;
		}
		SpringApplication.run(LocationApplication.class, args);
	}

}
