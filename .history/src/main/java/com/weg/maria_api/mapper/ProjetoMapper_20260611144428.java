package com.weg.maria_api.mapper;

import org.springframework.stereotype.Component;

import com.weg.maria_api.dto.projeto.ProjetoRequestDTO;
import com.weg.maria_api.entity.Projeto;

@Component
public class ProjetoMapper {

    public Projeto toEntity(ProjetoRequestDTO projeto){
        return new Projeto(
            
        )
    }

}
