package com.api.rest.service;

import com.api.rest.model.TagAcesso;
import com.api.rest.repository.TagAcessoRepository;
import com.api.rest.service.dto.TagAcessoDTO;
import com.api.rest.service.mapper.TagAcessoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
