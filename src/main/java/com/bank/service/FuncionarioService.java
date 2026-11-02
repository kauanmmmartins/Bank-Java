package com.bank.service;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.FuncionarioDAOImpl;

import java.util.Set;

public interface FuncionarioService {



    public Funcionario getFuncionario(Long id);

    public void delFuncionario(Long id);

    public boolean updateFuncionario(Funcionario funcionario, String cpf);

    public void addFuncionario(Funcionario funcionario);

    public Set<Funcionario> getAllFuncionario();
}
