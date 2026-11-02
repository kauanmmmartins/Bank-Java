package com.bank.repository.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private static List<Cliente> clientes = new ArrayList<>();

    @Override
    public Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> getAll() {
        return clientes;
    }

    @Override
    public void delCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public boolean updateCliente(Cliente cliente, String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)) {
                clientes.set(i, cliente);
                return true;
            }
        }
        return false;
    }
}