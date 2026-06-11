package com.weg.maria_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.maria_api.service.ProjetoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/projeto")
@RequiredArgsConstructor
public class ProjetoController {

    private final ProjetoService service;

    @Post

}
