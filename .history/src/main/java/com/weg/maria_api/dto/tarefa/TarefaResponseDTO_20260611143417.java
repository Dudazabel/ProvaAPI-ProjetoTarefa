package com.weg.maria_api.dto.tarefa;

import java.math.BigDecimal;

public record TarefaResponseDTO(
    Long id,
    String titulo,
    String codigo,
    BigDecimal 
) {

}
