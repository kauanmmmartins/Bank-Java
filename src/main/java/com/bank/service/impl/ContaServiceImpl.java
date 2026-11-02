package com.bank.service.impl;

import com.bank.model.Conta;
import com.bank.repository.ContaDAO;
import com.bank.repository.impl.ContaDAOImpl;
import com.bank.service.ContaService;

import java.util.List;

public class ContaServiceImpl implements ContaService {

    private ContaDAO contaDAO = new ContaDAOImpl();

    @Override
    public void addConta(Conta conta) {
        contaDAO.addConta(conta);
    }

    @Override
    public void delConta(Conta conta) {
        contaDAO.delConta(conta);
    }

    @Override
    public Conta getConta(String cpfTitular) {
        return contaDAO.get(cpfTitular);
    }

    @Override
    public List<Conta> getAllContas() {
        return contaDAO.getAll();
    }

    public boolean contaExistente(String cpfTitular) {
        return contaDAO.get(cpfTitular) != null;
    }

    @Override
    public boolean updateConta(Conta conta, String cpfTitular) {
        if (!contaExistente(cpfTitular)) {
            return false;
        }
        contaDAO.updateConta(conta);
        return true;
    }
}