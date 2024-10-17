package DesafioConversao;

import java.util.List;

public class Operacoes {

    public double calcularMedia(List<Double> salarios) {

        int qtdSalarios = salarios.size();
        double soma = 0;

        int i = 0;
        while (i < qtdSalarios){
            soma += salarios.get(i);
            i += 1;
        }

        double media = soma / qtdSalarios;

        return media;
    }
}
