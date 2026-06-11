package com.weg.maria_api.service;

import org.springframework.stereotype.Service;

import com.weg.maria_api.dto.tarefa.TarefaRequestDTO;
import com.weg.maria_api.dto.tarefa.TarefaResponseDTO;
import com.weg.maria_api.mapper.TarefaMapper;
import com.weg.maria_api.repository.ProjetoRepository;
import com.weg.maria_api.repository.TarefaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaMapper mapper;
    private final TarefaRepository tarefaRepository;
    private final ProjetoRepository projetoRepository;

    public TarefaResponseDTO criarTarefa(TarefaRequestDTO tarefa){
        Projeto
    }

}
