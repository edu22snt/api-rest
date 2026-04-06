package com.api.rest.service.dto;

import com.api.rest.model.Pessoa;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class TagAcessoDTO implements Serializable {

    private Long id;
    private Pessoa pessoa;
    private String numTag;
    private Integer ativa;
    private OffsetDateTime dataCadastro;

    public TagAcessoDTO() {
    }

    public TagAcessoDTO(Long id, Pessoa pessoa, String numTag, Integer ativa, OffsetDateTime dataCadastro) {
        this.id = id;
        this.pessoa = pessoa;
        this.numTag = numTag;
        this.ativa = ativa;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNumTag() {
        return numTag;
    }

    public void setNumTag(String numTag) {
        this.numTag = numTag;
    }

    public Integer getAtiva() {
        return ativa;
    }

    public void setAtiva(Integer ativa) {
        this.ativa = ativa;
    }

    public OffsetDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(OffsetDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
