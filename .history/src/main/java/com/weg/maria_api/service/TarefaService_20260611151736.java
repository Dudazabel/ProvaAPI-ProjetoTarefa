package com.weg.maria_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.maria_api.dto.tarefa.TarefaRequestDTO;
import com.weg.maria_api.dto.tarefa.TarefaResponseDTO;
import com.weg.maria_api.entity.Projeto;
import com.weg.maria_api.entity.Tarefa;
import com.weg.maria_api.mapper.TarefaMapper;
import com.weg.maria_api.projection.RelatorioTarefas;
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
        Projeto projeto = projetoRepository.findById(tarefa.idProjeto())
            .orElseThrow(() -> new RuntimeException("Projeto não encontrado!"));
        
        Tarefa tarefaSalva = mapper.toEntity(tarefa, projeto);
        return mapper.toResponse(tarefaRepository.save(tarefaSalva));
    }

    public List<TarefaResponseDTO> listarTarefas(){
        return mapper.toResponseList(tarefaRepository.findAll());
    }

    public TarefaResponseDTO buscarTarefaPorId(Long id){
        return mapper.toResponse(tarefaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Tarefa não encontrada!")));
    }

    public List<RelatorioTarefas> buscarRelatorio(){
        return tarefaRepository.buscarRelatorio();
    }

    public TarefaResponseDTO atualizarTarefa(Long id, TarefaRequestDTO tarefa){
        Tarefa tarefaSalva = tarefaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Tarefa não encontrada!"));
        tarefaSalva.se
    }

}
