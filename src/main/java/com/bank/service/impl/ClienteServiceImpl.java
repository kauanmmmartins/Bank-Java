package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.service.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO clienteDAO = new ClienteDAOImpl();
    @Override
    public void addCliente(Cliente cliente) {
         clienteDAO.addCliente(cliente);


    }

    @Override
    public Cliente getCliente(String cpf) {
        return clienteDAO.getCliente(cpf);
    }

    @Override
    public void delCliente(String cpf) {
        if (!clienteExistente(cpf)){
            System.out.println("cliente não existe");
        }else {
            Cliente cliente = clienteDAO.getCliente(cpf);
            if(cliente != null){
                clienteDAO.delCliente(cliente);
            }

        }

    }

    @Override
    public boolean updateCliente(Cliente cliente, String cpf) {
        return false;
    }

    @Override
    public List<Cliente> getAll() {
        return clienteDAO.getAll();
    }
    public boolean clienteExistente(String cpf) {
        return clienteDAO.getCliente(cpf) != null;
    }
}
