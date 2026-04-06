package com.api.rest.service;

import com.api.rest.model.TagAcesso;
import com.api.rest.repository.TagAcessoRepository;
import com.api.rest.service.dto.TagAcessoDTO;
import com.api.rest.service.mapper.TagAcessoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class TagAcessoService {

    private final Logger log = LoggerFactory.getLogger(TagAcessoService.class);
    private TagAcessoMapper tagAcessoMapper;
    private TagAcessoRepository tagAcessoRepository;

    public TagAcessoService(TagAcessoRepository tagAcessoRepository) {
        this.tagAcessoRepository = tagAcessoRepository;
    }

    public TagAcessoDTO save(TagAcessoDTO tagAcessoDTO) {
        log.debug("Request to post save TagAcesso");
        TagAcesso tagAcesso = tagAcessoMapper.dtoToEntity(tagAcessoDTO);
        tagAcesso = tagAcessoRepository.save(tagAcesso);
        return tagAcessoMapper.entityToDto(tagAcesso);
    }

    @Transactional(readOnly = true)
    public Optional<TagAcessoDTO> findOne(Long id) {
        log.debug("Request to get one TagAcesso by id");
        return tagAcessoRepository.findById(id).map(TagAcessoMapper::entityToDto);
    }

    @Transactional(readOnly = true)
    public Page<TagAcessoDTO> findAll(Pageable pageable) {
        log.debug("Request to get all TagAcesso");
        return tagAcessoRepository.findAll(pageable).map(TagAcessoMapper::entityToDto);
    }
}
