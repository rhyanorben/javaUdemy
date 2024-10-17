package DesafioConversao;

//Receber os últimos 3 salários de uma pessoa
//Calcular a média dos 3 salários
//O funcionário na hora de fornecer o salário pode utilizar virgula ou ponto para as casas decimais

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDesafioConversao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();

        System.out.println("Informe o primeiro salário: ");
        String salario1 = scanner.next().replace(",", ".");
        Double valor1 = Double.parseDouble(salario1);
        salarios.add(valor1);

        System.out.println("Informe o segundo salário: ");
        String salario2 = scanner.next().replace(",", ".");
        Double valor2 = Double.parseDouble(salario2);
        salarios.add(valor2);

        System.out.println("Informe o terceiro salário: ");
        scanner.nextLine();
        String salario3 = scanner.next().replace(",", ".");
        Double valor3 = Double.parseDouble(salario3);
        salarios.add(valor3);

        System.out.println("Salario 1: " + salario1);
        System.out.println("Salario 2: " + salario2);
        System.out.println("Salario 3: " + salario3);
        System.out.println(salarios);

        Operacoes operacoes = new Operacoes();
        double media = operacoes.calcularMedia(salarios);

        System.out.println("Média salarial: " + media);

        scanner.close();
    }
}
