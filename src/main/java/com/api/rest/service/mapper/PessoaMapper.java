package com.api.rest.service.mapper;

import com.api.rest.model.Pessoa;
import com.api.rest.service.dto.PessoaDTO;

public class PessoaMapper {

    public static Pessoa dtoToEntity(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa();

        pessoa.setId(pessoaDTO.getId());
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setNumTelefone(pessoaDTO.getNumTelefone());
        pessoa.setCpf(pessoaDTO.getCpf());
        pessoa.setBloco(pessoaDTO.getBloco());
        pessoa.setApartamento(pessoaDTO.getApartamento());
        return pessoa;
    }

    public static PessoaDTO entityToDto(Pessoa pessoa) {
        PessoaDTO pessoaDTO = new PessoaDTO();

        pessoaDTO.setId(pessoa.getId());
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setNumTelefone(pessoa.getNumTelefone());
        pessoaDTO.setCpf(pessoa.getCpf());
        pessoaDTO.setBloco(pessoa.getBloco());
        pessoaDTO.setApartamento(pessoa.getApartamento());
        return pessoaDTO;
    }
}
