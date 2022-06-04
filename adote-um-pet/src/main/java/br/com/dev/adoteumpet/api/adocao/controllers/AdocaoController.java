package br.com.dev.adoteumpet.api.adocao.controllers;

import br.com.dev.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.dev.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.dev.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.dev.adoteumpet.api.adocao.services.AdocaoService;
import br.com.dev.adoteumpet.core.models.Adocao;
import br.com.dev.adoteumpet.core.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/adocoes")
public class AdocaoController {

    @Autowired
    private AdocaoService adocaoService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdocaoResponse create(@RequestBody @Valid AdocaoRequest adocaoRequest) {
        return adocaoService.create(adocaoRequest);
    }

    @GetMapping
    public List<AdocaoResponse> findAll() {
        return adocaoService.findAll();
    }


}
