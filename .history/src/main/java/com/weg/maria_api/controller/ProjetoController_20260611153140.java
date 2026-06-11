package com.weg.maria_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.maria_api.dto.projeto.ProjetoRequestDTO;
import com.weg.maria_api.dto.projeto.ProjetoResponseDTO;
import com.weg.maria_api.service.ProjetoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/projeto")
@RequiredArgsConstructor
public class ProjetoController {

    private final ProjetoService service;

    @PostMapping
    public ResponseEntity<ProjetoResponseDTO> criarProjeto(@Valid @RequestBody ProjetoRequestDTO projeto){
        return ResponseEntity.status(Htt)
    }

}
