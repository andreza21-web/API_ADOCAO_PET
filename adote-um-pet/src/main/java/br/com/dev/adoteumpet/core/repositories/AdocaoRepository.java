package br.com.dev.adoteumpet.core.repositories;

import br.com.dev.adoteumpet.core.exceptions.PetNotFoundException;
import br.com.dev.adoteumpet.core.models.Adocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {


}
