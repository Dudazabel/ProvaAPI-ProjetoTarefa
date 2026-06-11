package com.weg.maria_api.dto.tarefa;

import java.math.BigDecimal;

public record TarefaRequestDTO(
    String titulo,
    String codigo,
    BigDecimal custo,
    Long idProjeto
) {

}
