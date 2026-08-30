package com.bank.repository;

import com.bank.model.Agencia;
import java.util.List;
import java.util.Map;

public interface AgenciaDAO {

    public void addAgencia(Agencia agencia);

    public void delAgencia(Agencia agencia);

    public Agencia getAgencia(Long id);

    public Map<Long,Agencia> getAllAgencias();
}