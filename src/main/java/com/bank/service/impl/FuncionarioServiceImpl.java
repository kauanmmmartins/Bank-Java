package com.bank.service.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.FuncionarioDAOImpl;
import com.bank.service.FuncionarioService;

import java.util.Set;

public class FuncionarioServiceImpl implements FuncionarioService {

    public FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();

    public boolean funcionarioExistente(long id){
        return funcionarioDAO.getFuncionario(id) != null;
    }

    @Override
    public Funcionario getFuncionario(Long id) {
        return funcionarioDAO.getFuncionario(id);
    }

    @Override
    public void delFuncionario(Long id) {
        if (!funcionarioExistente(id)){
            System.out.println("Funcionario não existente");
        }
        else{
            funcionarioDAO.delFuncionario(id);
        }
    }

    @Override
    public boolean updateFuncionario(Funcionario funcionario, String cpf) {
         return funcionarioDAO.updateFuncionario(funcionario,cpf);
    }

    @Override
    public void addFuncionario(Funcionario funcionario) {
        if (funcionario.getSalario() >= 1621.00){
            funcionarioDAO.addFuncionario(funcionario);
        }

    }

    @Override
    public Set<Funcionario> getAllFuncionario() {
        return funcionarioDAO.getAllFuncionario();
    }
}
