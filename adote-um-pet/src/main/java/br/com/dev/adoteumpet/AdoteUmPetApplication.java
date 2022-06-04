package br.com.dev.adoteumpet;

import br.com.dev.adoteumpet.core.models.Pet;
import br.com.dev.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pet pet = new Pet();
		pet.setNome("Joãzinho");
		pet.setHistoria("Historia emocionante");
		pet.setFoto("http://www.exemplo.com.br/foto.png");
		petRepository.save(pet);
	}
}
