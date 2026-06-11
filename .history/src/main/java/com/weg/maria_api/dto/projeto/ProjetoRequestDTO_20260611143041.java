package com.weg.maria_api.dto.projeto;

import jakarta.validation.constraints.NotBlank;

public record ProjetoRequestDTO(
    @NotBlank
    String nome
) {

}
