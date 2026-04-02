package com.api.rest.model;

import java.time.OffsetDateTime;

public class TagAcesso {

    private Long id;
    private Pessoa pessoa;
    private String numTag;
    private Boolean ativa;
    private OffsetDateTime dataCadastro;

    public TagAcesso () {
    }

    public TagAcesso (Long id, Pessoa pessoa, String numTag, Boolean ativa, OffsetDateTime dataCadastro) {
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

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public OffsetDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(OffsetDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
