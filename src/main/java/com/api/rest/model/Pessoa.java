package com.api.rest.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_PESSOA")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "TX_TELEFONE")
    private String numTelefone;

    @Column(name = "TX_CPF")
    private String cpf;

    @Column(name = "TX_BLOCO")
    private String bloco;

    @Column(name = "TX_APARTAMENTO")
    private String apartamento;

    @Column(name = "NU_ATIVO")
    private Integer ativo;


    public Pessoa() {}

    public Pessoa(Long id,  String nome, String numTelefone, String cpf, String bloco, String apartamento, Integer ativo) {
        this.id = id;
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.cpf = cpf;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.ativo = ativo;
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

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
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

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }
}
