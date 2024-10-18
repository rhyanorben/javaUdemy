package DesafioCalculadora;

import java.util.Scanner;

public class MainDesafioCalculadora {

    public static void main(String[] args) {

        /*
        Ler num1
        Ler num2
        // Solicitar a operação que o usuário vai realizar
        + - / *
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        Double primeiroValor = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        Double segundoValor = scanner.nextDouble();

        System.out.println("Qual operação você quer realizar?");
        String operacao = scanner.next();


        Double resultado =
                operacao.equals("+") ? primeiroValor + segundoValor :
                operacao.equals("-") ? primeiroValor - segundoValor :
                operacao.equals("/") ? primeiroValor / segundoValor :
                operacao.equals("*") ? primeiroValor * segundoValor : 0;

        System.out.printf("%.2f %s %.2f = %.2f", primeiroValor, operacao, segundoValor, resultado);

        scanner.close();

    }

}
