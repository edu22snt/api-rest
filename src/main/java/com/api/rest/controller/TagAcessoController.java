package com.api.rest.controller;

import com.api.rest.service.TagAcessoService;
import com.api.rest.service.dto.TagAcessoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/acesso")
public class TagAcessoController {

    private final TagAcessoService service;

    public TagAcessoController(TagAcessoService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<TagAcessoDTO> save(@RequestBody TagAcessoDTO tagAcessoDTO) throws URISyntaxException {
        TagAcessoDTO result = service.save(tagAcessoDTO);
        return ResponseEntity.created(new URI("/api/save/" + result.getId())).body(tagAcessoDTO);
    }
}
