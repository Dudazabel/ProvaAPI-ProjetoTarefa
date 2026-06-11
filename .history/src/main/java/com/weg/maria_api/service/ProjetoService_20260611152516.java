package com.weg.maria_api.service;

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
        return 
    }

}
