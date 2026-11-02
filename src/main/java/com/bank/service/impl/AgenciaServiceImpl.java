package com.bank.service.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaDAO;
import com.bank.repository.impl.AgenciaDAOImpl;
import com.bank.service.AgenciaService;

import java.util.Set;
import java.util.HashSet;

public class AgenciaServiceImpl implements AgenciaService {

    private AgenciaDAO agenciaDAO = new AgenciaDAOImpl();

    public boolean agenciaExistente(long id) {
        return agenciaDAO.getAgencia(id) != null;
    }

    @Override
    public void addAgencia(Agencia agencia) {
        agenciaDAO.addAgencia(agencia);
    }

    @Override
    public Set<Agencia> getAllAgencia() {
        return new HashSet<>(agenciaDAO.getAllAgencias().values());
    }

    @Override
    public Agencia getAgencia(Long id) {
        return agenciaDAO.getAgencia(id);
    }

    @Override
    public void delAgencia(Long id) {
        if (!agenciaExistente(id)) {
            System.out.println("agencia não existente");
        } else {
            Agencia agencia = agenciaDAO.getAgencia(id);
            if (agencia != null) {
                agenciaDAO.delAgencia(agencia);
            }
        }
    }

    @Override
    public boolean updateAgencia(Agencia agencia, Long id) {
        if (!agenciaExistente(id)) {
            return false;
        }
        agenciaDAO.atulizarAgencia(agencia, id);
        return true;

    }
}