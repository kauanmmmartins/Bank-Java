package com.bank.model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal;

    public ContaPoupanca(){
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

    public ContaPoupanca(String cpfTitular, Long numeroConta, BigDecimal saldo, Long idAgencia, double rendimentoMensal) {
        super(cpfTitular, numeroConta, saldo, idAgencia);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }
}
