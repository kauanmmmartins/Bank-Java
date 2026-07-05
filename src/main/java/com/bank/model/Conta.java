package com.bank.model;

import java.math.BigDecimal;

public class Conta {
    private String cpfTitular;
    private Long numeroConta;
    private BigDecimal saldo;
    private Long idAgencia;

    public Conta(String cpfTitular, Long numeroConta, BigDecimal saldo, Long idAgencia) {
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.idAgencia = idAgencia;
    }
    public Conta() {

    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Long getIdAgencia() {
        return idAgencia;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }
}
