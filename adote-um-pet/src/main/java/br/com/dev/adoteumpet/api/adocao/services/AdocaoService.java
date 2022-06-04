package br.com.dev.adoteumpet.api.adocao.services;

import br.com.dev.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.dev.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.dev.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.dev.adoteumpet.core.models.Adocao;
import br.com.dev.adoteumpet.core.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdocaoService {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;

    public AdocaoResponse create(AdocaoRequest adocaoRequest) {
        Adocao adocaoToCreate = adocaoMapper.toModel(adocaoRequest);
        Object createdAdocao = adocaoRepository.save(adocaoToCreate);
        return adocaoMapper.toResponse((Adocao) createdAdocao);
    }

    public List<AdocaoResponse> findAll() {
        return adocaoRepository.findAll()
                .stream()
                .map(adocaoMapper::toResponse).collect(Collectors.toList());
    }

}