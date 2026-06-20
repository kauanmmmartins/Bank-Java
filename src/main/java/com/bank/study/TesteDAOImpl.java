package com.bank.study;

import java.util.ArrayList;
import java.util.List;

public class TesteDAOImpl {
    // arrayList-Possui indice, pode repetir, um tipo de ordem
    private static List <PessoaStudy> dataBase = new ArrayList<>();

    public void  add(PessoaStudy pessoa) {
        dataBase.add(pessoa);
        System.out.println("pessoa adicionada com sucesso");
    }

    public PessoaStudy ler(String cpf){
        for(int i = 0; i<dataBase.size(); i++){
            if (dataBase.get(i).getCpf().equals(cpf)){
                return dataBase.get(i);
            }
        }
        System.out.println("pessoa não encontrada");
        return null;
    }
    public List<PessoaStudy> lerTudo() {
        if(!dataBase.isEmpty()){
            return dataBase;
        }
        System.out.println("Lista vazia");
        return null;
    }
}
