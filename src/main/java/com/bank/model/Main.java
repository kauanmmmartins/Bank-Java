package com.bank.model;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaSalario contaSalario1 = new ContaSalario("234421","fabricio", 12345L, new BigDecimal(5000L), 1L );
        System.out.println(Cargo.GERENTE);
        for (Cargo cargo: Cargo.values()){
            System.out.println(cargo);
            System.out.println(cargo.getSalarioMinimo());
        }
    }

}
