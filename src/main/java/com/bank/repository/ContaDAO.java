package com.bank.repository;

import com.bank.model.Conta;

import java.util.List;

public interface ContaDAO {
    public Conta get(String cpfTitular);

    public List <Conta> getAll();

    public void delConta(Conta conta);

    public void addConta(Conta conta);

    public Conta updateConta(Conta conta);


}
