package com.example.course_txt.entities;

public class Banco {

    private Long id;
    private String nome;
    private Long conta;
    private Long agencia;
    private Long cpf;

    public Banco() {
    }

    public Banco(Long id, String nome, Long conta, Long agencia, Long cpf) {
        this.id = id;
        this.nome = nome;
        this.conta = conta;
        this.agencia = agencia;
        this.cpf = cpf;
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

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
