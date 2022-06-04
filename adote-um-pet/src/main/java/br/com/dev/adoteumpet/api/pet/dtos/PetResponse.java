package br.com.dev.adoteumpet.api.pet.dtos;

import jdk.nashorn.internal.runtime.Debug;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetResponse {

    private Long id;

    private String nome;

    private String historia;

    private String foto;

}
