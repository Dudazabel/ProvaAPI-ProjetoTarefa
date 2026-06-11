package com.weg.maria_api.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.maria_api.dto.projeto.ProjetoResponseDTO;
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
            new ProjetoResponseDTO(
                tarefa.getProjeto().getId(),
                tarefa.getProjeto().getNome()
            )
        );
    }

    public List<Tarefa> toResponseList(List<Tarefa> tarefa){
        return tarefa.stream().map(this::to)
    }

}
