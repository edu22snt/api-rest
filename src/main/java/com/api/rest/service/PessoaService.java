package com.api.rest.service;

import com.api.rest.model.Pessoa;
import com.api.rest.repository.PessoaRepository;
import com.api.rest.service.dto.PessoaDTO;
import com.api.rest.service.mapper.PessoaMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PessoaService {

    private PessoaMapper pessoaMapper;
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaDTO save(PessoaDTO pessoaDTO) {
        Pessoa pessoa = pessoaMapper.dtoToEntity(pessoaDTO);
        pessoa = pessoaRepository.save(pessoa);
        return pessoaMapper.entityToDto(pessoa);
    }

    @Transactional(readOnly = true)
    public Optional<PessoaDTO> findOne(Long id) {
        return pessoaRepository.findById(id).map(PessoaMapper::entityToDto);
    }


}
