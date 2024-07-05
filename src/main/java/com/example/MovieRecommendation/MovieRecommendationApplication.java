package com.example.MovieRecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8080/recommend?genre=
//mvn spring-boot:run
@SpringBootApplication
public class MovieRecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommendationApplication.class, args);
	}

}
