package br.com.dev.adoteumpet.api.pet.controllers;

import br.com.dev.adoteumpet.api.pet.dtos.PetRequest;
import br.com.dev.adoteumpet.api.pet.dtos.PetResponse;
import br.com.dev.adoteumpet.api.pet.mappers.PetMapper;
import br.com.dev.adoteumpet.api.pet.services.PetService;
import br.com.dev.adoteumpet.core.models.Pet;
import br.com.dev.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<PetResponse> findAll() {
        return petService.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PetResponse create(@RequestBody @Valid PetRequest petRequest) {
        return petService.create(petRequest);
    }


}
