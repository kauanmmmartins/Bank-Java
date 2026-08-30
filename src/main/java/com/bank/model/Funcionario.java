package com.bank.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private Double salario;
    private Setor setor;
    private Long id;

    public Funcionario (Cargo cargo,Double salario, Setor setor,String nome,String cpf, String email, LocalDate dataNascimento, Long id){
        super(nome, cpf, email, dataNascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
        this.id = id;
    }
    public Funcionario(){

    }

    public Cargo getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Long getId() {
        return id;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
