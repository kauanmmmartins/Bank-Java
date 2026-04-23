package com.bank.study;

public class PessoaStudy {
    private String nome;
    public static String sobrenome;
    private String idade;
    private String cpf;
    public String telefone;
    protected String pais;
    public static final String rg ="93093939";

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;

    }

    public String getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}

