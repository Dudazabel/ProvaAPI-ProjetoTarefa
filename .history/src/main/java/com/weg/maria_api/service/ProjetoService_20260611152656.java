package com.weg.maria_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.maria_api.dto.projeto.ProjetoRequestDTO;
import com.weg.maria_api.dto.projeto.ProjetoResponseDTO;
import com.weg.maria_api.entity.Projeto;
import com.weg.maria_api.mapper.ProjetoMapper;
import com.weg.maria_api.repository.ProjetoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjetoService {

    private final ProjetoMapper mapper;
    private final ProjetoRepository repository;

    public ProjetoResponseDTO criarProjeto(ProjetoRequestDTO projeto){
        Projeto projetoSalvo = mapper.toEntity(projeto);
        return mapper.toResponse(repository.save(projetoSalvo));
    }

    public List<ProjetoResponseDTO> listarProjetos(){
        return mapper.toResponseList(repository.findAll());
    }

    public ProjetoResponseDTO buscarProjetoPorId(Long id){
        return mapper.toResponse(repository.findById(id)
            .orElseThrow(() -> new ))   
    }

}
