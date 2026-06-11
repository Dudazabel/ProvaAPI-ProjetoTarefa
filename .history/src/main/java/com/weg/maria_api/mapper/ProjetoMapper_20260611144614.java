package com.weg.maria_api.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.maria_api.dto.projeto.ProjetoRequestDTO;
import com.weg.maria_api.dto.projeto.ProjetoResponseDTO;
import com.weg.maria_api.entity.Projeto;

@Component
public class ProjetoMapper {

    public Projeto toEntity(ProjetoRequestDTO projeto){
        return new Projeto(
            projeto.nome()
        );
    }

    public ProjetoResponseDTO toResponse(Projeto projeto){
        return new ProjetoResponseDTO(
            projeto.getId(),
            projeto.getNome()
        );
    }

    public List<ProjetoResponseDTO> toResponseList(List<Projeto> projetos){
        return projetos
            .stream()
            .map(this::toResponse).toList();
    }

}
