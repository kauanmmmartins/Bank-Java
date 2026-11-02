package com.bank.repository;

import com.bank.model.Cliente;
import java.util.List;

public interface ClienteDAO {

    Cliente getCliente(String cpf);

    List<Cliente> getAll();

    void delCliente(Cliente cliente);

    void addCliente(Cliente cliente);

    boolean updateCliente(Cliente cliente, String cpf);
}