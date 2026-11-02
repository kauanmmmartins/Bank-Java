package com.bank.service;

import com.bank.model.Conta;
import java.util.List;

public interface ContaService {

    public void addConta(Conta conta);

    public void delConta(Conta conta);

    public Conta getConta(String cpfTitular);

    public List<Conta> getAllContas();

    public boolean updateConta(Conta conta, String cpfTitular);

}