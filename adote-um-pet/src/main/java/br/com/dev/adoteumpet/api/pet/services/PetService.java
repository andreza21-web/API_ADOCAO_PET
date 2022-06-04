package br.com.dev.adoteumpet.api.pet.services;

import br.com.dev.adoteumpet.api.pet.dtos.PetRequest;
import br.com.dev.adoteumpet.api.pet.dtos.PetResponse;
import br.com.dev.adoteumpet.api.pet.mappers.PetMapper;
import br.com.dev.adoteumpet.core.models.Pet;
import br.com.dev.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    public List<PetResponse> findAll() {
        return petRepository.findAll()
                .stream()
                .map(petMapper::toResponse).collect(Collectors.toList());
    }

    public PetResponse create(PetRequest petRequest) {
        Pet petToCreate = petMapper.toModel(petRequest);
        Object createdPet = petRepository.save(petToCreate);
        return petMapper.toResponse((Pet) createdPet);
    }



}
