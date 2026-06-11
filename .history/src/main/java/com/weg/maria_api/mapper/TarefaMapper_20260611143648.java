package com.weg.maria_api.mapper;

import org.springframework.stereotype.Component;

import com.weg.maria_api.dto.tarefa.TarefaRequestDTO;
import com.weg.maria_api.entity.Projeto;
import com.weg.maria_api.entity.Tarefa;

@Component
public class TarefaMapper {

    public Tarefa toEntity(TarefaRequestDTO tarefa, Projeto projeto){
        Tarefa tarefaSalva = new Tarefa();
        tarefaSalva.setTitulo();
    }

}
