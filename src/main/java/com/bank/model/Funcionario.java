package com.bank.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private Double salario;
    private Setor setor;

    public Funcionario (Cargo cargo,Double salario, Setor setor,String nome,String cpf, String email, LocalDate dataNascimento){
        super(nome, cpf, email, dataNascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
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

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
