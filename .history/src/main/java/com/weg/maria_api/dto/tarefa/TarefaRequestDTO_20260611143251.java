package com.weg.maria_api.dto.tarefa;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;

public record TarefaRequestDTO(
    @NotBlank(message = "O título não deve estar em branco!")
    String titulo,
    @NotBlank(message = "O código não deve estar em branco!")
    String codigo,
    @No
    BigDecimal custo,
    Long idProjeto
) {

}
