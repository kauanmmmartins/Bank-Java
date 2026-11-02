package com.bank.service;


import com.bank.model.Cliente;

import java.util.List;

public interface ClienteService {

    public void addCliente(Cliente cliente);

    public Cliente getCliente(String cpf);

    public void delCliente(String cpf);

    public boolean updateCliente(Cliente cliente, String cpf);

    List<Cliente> getAll();

}
