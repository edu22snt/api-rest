package com.api.rest.model;

public class Pessoa {

    private Long id;
    private String nome;
    private Number numTelefone;
    private String cpf;
    private String bloco;
    private String apartamento;

    public Pessoa() {

    }

    public Pessoa(Long id,  String nome, Number numTelefone, String cpf, String bloco, String apartamento) {
        this.id = id;
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.cpf = cpf;
        this.bloco = bloco;
        this.apartamento = apartamento;
    }

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
