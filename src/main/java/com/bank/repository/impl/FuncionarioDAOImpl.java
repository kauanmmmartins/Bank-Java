package com.bank.repository.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;

import java.util.HashSet;
import java.util.Set;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    // HashSet - não possui ordem, não permite repetição, não possui indice
    public Set<Funcionario> dataBase = new HashSet<>();

    @Override
    public Funcionario getFuncionario(Long id) {
        for (Funcionario funcionario: dataBase){
            if (funcionario.getId().equals(id)){
                return funcionario;
            }
        }
        return null;

    }

    @Override
    public void delFuncionario(Long id) {
        Funcionario funcionario = getFuncionario(id);
        dataBase.remove(funcionario);

    }

    @Override
    public boolean updateFuncionario(Funcionario funcionario) {
        return false;
    }

    @Override
    public void addFuncionario(Funcionario funcionario) {

    }

    @Override
    public Set<Funcionario> getAllFuncionario() {
        return dataBase;
    }
}
