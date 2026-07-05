package com.bank.model;

import java.math.BigDecimal;

public class ContaSalario extends  Conta {
    private String cnpjEmpresa;

    public  ContaSalario(String cnpjEmpresa,String cpfTitular, Long numeroConta, BigDecimal saldo, Long idAgencia) {
        super(cpfTitular, numeroConta, saldo, idAgencia);
        this.cnpjEmpresa = cnpjEmpresa;
    }
    public ContaSalario() {
        super();
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
