package com.weg.maria_api.dto.tarefa;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.weg.maria_api.dto.projeto.ProjetoResponseDTO;

public record TarefaResponseDTO(
    Long id,
    String titulo,
    String codigo,
    BigDecimal custo,
    LocalDate dataCriacao,
    ProjetoResponseDTO projeto
) {

}
