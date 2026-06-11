package com.weg.maria_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.maria_api.dto.tarefa.TarefaResponseDTO;
import com.weg.maria_api.service.TarefaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tarefa")
@RequiredArgsConstructor
public class TarefaController {

    private final TarefaService service;

    @PostMapping
    public ResponseEntity<TarefaResponseDTO

}
