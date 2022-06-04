package br.com.dev.adoteumpet.api.pet.controllers;

import br.com.dev.adoteumpet.api.pet.mappers.PetMapper;
import br.com.dev.adoteumpet.core.models.Pet;
import br.com.dev.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    @GetMapping("/pets")
    public List<Pet> findAll() {
        return petRepository.findAll();
    }


}
