package com.weg.maria_api.dto.tarefa;

import java.math.BigDecimal;
import java.time.LocalDate;

public record TarefaResponseDTO(
    Long id,
    String titulo,
    String codigo,
    BigDecimal custo,
    LocalDate dataCriacao
) {

}
