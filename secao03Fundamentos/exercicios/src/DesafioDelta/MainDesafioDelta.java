package DesafioDelta;

import java.util.Scanner;

/**
 * Essa aplicação consiste em buscar o delta de uma equação de segundo grau
 * @author Rhyan Orben
 * */

public class MainDesafioDelta {
    public static void main(String[] args) {

        // Delta = b² - 4 . a . c

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        String stringA = scanner.next().replace(",", ".");
        System.out.println("Informe o valor de b: ");
        String stringB = scanner.next().replace(",", ".");
        System.out.println("Informe o valor de c: ");
        String stringC = scanner.next().replace(",", ".");

        Double a = Double.parseDouble(stringA);
        Double b = Double.parseDouble(stringB);
        Double c = Double.parseDouble(stringC);

        Double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("Delta é: %.2f", delta);

        scanner.close();
    }
}
