package com.weg.maria_api.mapper;

import org.springframework.stereotype.Component;

import com.weg.maria_api.dto.tarefa.TarefaRequestDTO;
import com.weg.maria_api.dto.tarefa.TarefaResponseDTO;
import com.weg.maria_api.entity.Projeto;
import com.weg.maria_api.entity.Tarefa;

@Component
public class TarefaMapper {

    public Tarefa toEntity(TarefaRequestDTO tarefa, Projeto projeto){
        Tarefa tarefaSalva = new Tarefa();
        tarefaSalva.setTitulo(tarefa.titulo());
        tarefaSalva.setCodigo(tarefa.codigo());
        tarefaSalva.setCusto(tarefa.custo());
        tarefaSalva.setProjeto(projeto);
        return tarefaSalva;
    }

    public TarefaResponseDTO toResponse(Tarefa tarefa){
        return new TarefaResponseDTO(
            tarefa.getId(),
            tarefa.getTitulo(),
            tarefa.getCodigo(),
            tarefa.getCusto(),
            tarefa.getDataCriacao(),
            tarefa.getProjeto().getId(),
            tarefa.getProjeto().getNome()
        );
    }

}
