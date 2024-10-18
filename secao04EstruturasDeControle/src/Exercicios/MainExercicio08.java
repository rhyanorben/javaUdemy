package Exercicios;

import java.util.Scanner;

public class MainExercicio08 {
    public static void main(String[] args) {

        // Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Scanner scanner = new Scanner(System.in);

        Double maiorValor = 0.0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("Informe o %dº valor: ", i);
            String valorString = scanner.next().replace(",", ".");
            Double valor = Double.parseDouble(valorString);
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor fornecido foi: " + maiorValor);

        scanner.close();

    }
}
