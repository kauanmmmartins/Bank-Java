package com.bank.model;

public enum Cargo {
    DIRETOR(50000.0,100000.0), GERENTE(20000.0,40000.0), TERCERIZADO(2500.0,3500.0), CAIXA(1700.0,2200.0);
    private Double salarioMinimo;
    private Double salarioMaximo;

    Cargo(Double salarioMinimo, Double salarioMaximo) {
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
    }

    public Double getSalarioMinimo() {
        return salarioMinimo;
    }

    public Double getSalarioMaximo() {
        return salarioMaximo;

    }
}
