package com.api.rest.controller;

import com.api.rest.service.PessoaService;
import com.api.rest.service.dto.PessoaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<PessoaDTO> findById(@PathVariable Long id) throws URISyntaxException {
         Optional<PessoaDTO> pessoaDTO = service.findOne(id);
        return pessoaDTO;

    }

}
