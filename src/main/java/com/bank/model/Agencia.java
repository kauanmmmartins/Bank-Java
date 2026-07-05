package com.bank.model;

public class Agencia {
     private Long id;
     private String nome;
     private String cidade;

     public Agencia(Long id,String nome, String cidade) {
         this.id = id;
         this.nome = nome;
         this.cidade = cidade;
     }
     public Agencia() {

     }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
