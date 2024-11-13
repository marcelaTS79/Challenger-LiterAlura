package com.LiterAlura.challenge_2_LiterAlura;
import com.LiterAlura.challenge_2_LiterAlura.Libreria.Libreria;
import com.LiterAlura.challenge_2_LiterAlura.repository.iAutorRepository;
import com.LiterAlura.challenge_2_LiterAlura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge2LiterAluraApplicationConsola implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(Challenge2LiterAluraApplicationConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
