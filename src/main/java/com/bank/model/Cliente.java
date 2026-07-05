package com.bank.model;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private int score;

    public Cliente(int score,String nome,String cpf, String email, LocalDate dataNascimento) {
        super(nome, cpf, email, dataNascimento);
        this.score = score;
    }
    public Cliente(){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

