package Exercicios;

import java.util.Scanner;

public class MainExercicio04 {
    public static void main(String[] args) {

        //Criar um programa que receba um número e diga se ele é um número primo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        Integer num = scanner.nextInt();

        int contadorDivisoes = 0;

        for (int i = 1; i <= num; i++ ) {
            int verificacao = num % i;
            if (verificacao == 0) {
                contadorDivisoes++;
            }
        }

        if (contadorDivisoes == 2) {
            System.out.printf("O número %d é primo!", num);
        } else {
            System.out.printf("O número não é primo!", num);
        }

        scanner.close();

    }
}
