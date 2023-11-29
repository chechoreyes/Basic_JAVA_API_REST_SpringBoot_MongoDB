package dev.chechoreyes.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController generate a API REST
@RestController()
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// @GetMapping genera la ruta de la API
	@GetMapping("/")
	public String apiRoot() {
		return "Hello World";
	}

}
