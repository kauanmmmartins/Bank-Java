package com.bank.repository.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgenciaDAOImpl implements AgenciaDAO {

    // Hash map - esse tipo de lista possui uma key e entidade, ela não possui indice, nao possui ordem mas "permite repetição"
    private static Map<Long,Agencia> dataBase = new HashMap<>();

    @Override
    public void addAgencia(Agencia agencia) {
        dataBase.put(agencia.getId(),agencia);
    }

    @Override
    public void delAgencia(Agencia agencia) {
        dataBase.remove(agencia.getId());
    }

    @Override
    public Agencia getAgencia(Long id) {
        return dataBase.get(id);
    }

    @Override
    public Map< Long ,Agencia> getAllAgencias() {
        return this.dataBase;
    }
}