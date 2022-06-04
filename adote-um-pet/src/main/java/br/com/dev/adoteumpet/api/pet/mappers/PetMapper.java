package br.com.dev.adoteumpet.api.pet.mappers;

import br.com.dev.adoteumpet.api.pet.dtos.PetResponse;
import br.com.dev.adoteumpet.core.models.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetResponse toResponde(Pet pet) {

        PetResponse petResponse = new PetResponse();
        petResponse.setId(pet.getId());
        petResponse.setNome(pet.getNome());
        petResponse.setHistoria(pet.getHistoria());
        petResponse.setFoto(pet.getFoto());
        return petResponse;
    }
}
