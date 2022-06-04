package br.com.dev.adoteumpet.core.repositories;

import br.com.dev.adoteumpet.core.exceptions.PetNotFoundException;
import br.com.dev.adoteumpet.core.models.Adocao;
import br.com.dev.adoteumpet.core.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(PetNotFoundException::new);
    }
}
