package Exercicios;

import java.util.Scanner;

public class MainExercicio01 {
    public static void main(String[] args) {

        //Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner scanner = new Scanner(System.in);

        Integer numero = 0;
        Boolean criterio = true;

        while(criterio){
        System.out.println("Informe um número inteiro que esteja entre 0 e 10 e seja par:");
        String stringNumero = scanner.next().replace(",", ".");
        numero = Integer.parseInt(stringNumero);
            if (numero <= 10 && numero >= 0 && numero % 2 == 0) {
                System.out.println("Número está entre dez e é par!");
                criterio = false;
            } else if (numero > 10)  {
                System.out.println("Número é maior do que dez!");
            } else if (numero < 0){
                System.out.println("Número é menor do que zero!");
            } else if (numero % 2 == 1){
                System.out.println("Número é impar!");
            }
        }

        System.out.println("FIM!");

        scanner.close();

    }
}
