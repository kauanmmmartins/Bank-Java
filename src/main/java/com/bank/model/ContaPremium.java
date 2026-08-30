package com.bank.model;

import java.math.BigDecimal;

public class ContaPremium extends Conta{
    private int pontos;
    private double anuidade;

    public ContaPremium(){

    }

    @Override
    public void debito(BigDecimal valor) {
        if (valor.compareTo(getSaldo()) > 0){
            throw new RuntimeException("Saldo indisponivel");

        } else if ( valor.compareTo(new BigDecimal(0 ))!=1) {
            throw  new RuntimeException("Saldo Invalido");
        } else {
            setSaldo(getSaldo().subtract(valor));
            pontos += valor.intValue() / 5;

        }
    }

    public ContaPremium(int pontos, double anuidade, String cpfTitular, Long numeroConta, BigDecimal saldo,  Long idAgencia){
        super(cpfTitular,numeroConta,saldo, idAgencia);
        this.pontos = pontos;
        this.anuidade = anuidade;
    }

    public double getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(double anuidade) {
        this.anuidade = anuidade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
