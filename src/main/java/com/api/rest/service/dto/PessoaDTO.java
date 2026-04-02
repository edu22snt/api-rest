package com.api.rest.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class PessoaDTO implements Serializable {

    private Long id;

    @Size(max = 255, min = 5, message = "O nome deve ter entre 5 e 255 caracteres")
    @NotBlank(message = "O Nome é obrigatório")
    private String nome;

    @NotBlank(message = "O número de telefone é obrigatório")
    private Number numTelefone;

    @NotBlank(message = "O número de cpf é obrigatório")
    private String cpf;

    @NotBlank(message = "O número do bloco é obrigatório")
    private String bloco;

    @NotBlank(message = "O número do apartamento é obrigatório")
    private String apartamento;

    private Number ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(Number numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}
