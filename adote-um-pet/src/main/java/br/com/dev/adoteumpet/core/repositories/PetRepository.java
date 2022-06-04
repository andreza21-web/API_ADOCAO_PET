package br.com.dev.adoteumpet.core.repositories;

import br.com.dev.adoteumpet.core.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
