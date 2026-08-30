package com.bank.repository;

import com.bank.model.Funcionario;

import java.util.HashSet;
import java.util.Set;

public interface FuncionarioDAO {

    public Funcionario getFuncionario(Long id);

    public void delFuncionario(Long id);

    public boolean updateFuncionario(Funcionario funcionario);

    public void addFuncionario(Funcionario funcionario);

    public Set<Funcionario> getAllFuncionario();
}
