package com.bank.service;

import com.bank.model.Agencia;

import java.util.Set;

public interface AgenciaService {

    public Agencia getAgencia(Long id);

    public void delAgencia(Long id);

    public boolean updateAgencia(Agencia agencia,   Long id);

    public void addAgencia(Agencia agencia);

    public Set<Agencia> getAllAgencia();


}


