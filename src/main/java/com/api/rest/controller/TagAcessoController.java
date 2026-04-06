package com.api.rest.controller;

import com.api.rest.service.TagAcessoService;
import com.api.rest.service.dto.TagAcessoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<TagAcessoDTO> findById(@PathVariable Long id) {
        Optional<TagAcessoDTO> tagAcessoDTO = service.findOne(id);
        return tagAcessoDTO;
    }

    @GetMapping()
    public ResponseEntity<Page<TagAcessoDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update")
    public ResponseEntity<TagAcessoDTO> update(@RequestBody TagAcessoDTO tagAcessoDTO) {
        TagAcessoDTO result = service.update(tagAcessoDTO);
        return ResponseEntity.ok().body(result);
    }

}
