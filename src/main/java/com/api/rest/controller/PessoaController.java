package com.api.rest.controller;

import com.api.rest.service.PessoaService;
import com.api.rest.service.dto.PessoaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<PessoaDTO> save(@RequestBody PessoaDTO pessoaDTO) throws URISyntaxException {
        PessoaDTO result = service.save(pessoaDTO);
        return ResponseEntity.created(new URI("/api/save/" + result.getId())).body(pessoaDTO);
    }

//    public ResponseEntity<>

//    @PostMapping("/delete")
//    public ResponseEntity<Void> delete() {
//
//    }
//
//    @PostMapping("/update/{id}")
//    public ResponseEntity<Void> update(@PathVariable(value = "id", required = false) final Long id, @RequestBody PessoaDTO pessoaDTO) {
//
//    }



}
