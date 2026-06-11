package com.weg.maria_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.maria_api.dto.tarefa.TarefaRequestDTO;
import com.weg.maria_api.dto.tarefa.TarefaResponseDTO;
import com.weg.maria_api.projection.RelatorioTarefas;
import com.weg.maria_api.service.TarefaService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tarefa")
@RequiredArgsConstructor
public class TarefaController {

    private final TarefaService service;

    @PostMapping
    public ResponseEntity<TarefaResponseDTO> criarTarefa(@Valid @RequestBody TarefaRequestDTO tarefa){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarTarefa(tarefa));
    }

    @GetMapping
    public ResponseEntity<List<TarefaResponseDTO>> listarTarefas(){
        return ResponseEntity.ok(service.listarTarefas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaResponseDTO> buscarTarefaPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarTarefaPorId(id));
    }

    @GetMapping("/relatorio")
    public ResponseEntity<List<RelatorioTarefas>> buscarRelatorio(){
        return ResponseEntity.ok(service.buscarRelatorio());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarefaResponseDTO> atualizarTarefa(@Valid @RequestBody TarefaRequestDTO tarefa, @PathVariable Long id){
        return ResponseEntity.ok(service.atualizarTarefa(id, tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity

}
