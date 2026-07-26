package com.bank.repository.impl;

import com.bank.model.Conta;
import com.bank.repository.ContaDAO;

import java.util.ArrayList;
import java.util.List;

public class ContaDAOImpl implements ContaDAO {

    // array list- ela é uma lista que possui indice,ordem e permite repetição
    private static List<Conta> dataBase = new ArrayList<>();

    @Override
    public Conta get(String cpfTitular) {
        for(int i=0; i<dataBase.size();i++){
            if (dataBase.get(i).getCpfTitular().equals(cpfTitular)){
                return dataBase.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Conta> getAll() {
        return this.dataBase;

    }

    @Override
    public void delConta(Conta conta) {
        dataBase.remove(conta); 
    }

    @Override
    public void addConta(Conta conta) {
        dataBase.add(conta);
    }

    @Override
    public Conta updateConta(Conta conta) {
        for(Conta c : dataBase){
            if (c.getCpfTitular().equals(conta.getCpfTitular())) {
                c.setNumeroConta(conta.getNumeroConta());
                c.setIdAgencia(conta.getIdAgencia());
                return c;
            }
        }
        return null;
    }


}
