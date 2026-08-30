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

    @Override
    public void debito(BigDecimal valor) {
        if (valor.compareTo(getSaldo()) > 0){
            throw new RuntimeException("Saldo indisponivel");

        } else if ( valor.compareTo(new BigDecimal(0 ))!=1) {
            throw  new RuntimeException("Saldo Invalido");
        } else {
            setSaldo(getSaldo().subtract(valor));

        }
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
