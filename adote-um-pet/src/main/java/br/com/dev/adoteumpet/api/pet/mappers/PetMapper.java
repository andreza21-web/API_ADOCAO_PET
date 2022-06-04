package br.com.dev.adoteumpet.api.pet.mappers;

import br.com.dev.adoteumpet.api.pet.dtos.PetRequest;
import br.com.dev.adoteumpet.api.pet.dtos.PetResponse;
import br.com.dev.adoteumpet.core.models.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet) {
        return PetResponse.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .historia(pet.getHistoria())
                .foto(pet.getFoto())
                .build();
    }

    public Pet toModel(PetRequest petRequest) {
        return Pet.builder()
                .nome(petRequest.getNome())
                .historia(petRequest.getHistoria())
                .foto(petRequest.getFoto())
                .build();
    }

}
