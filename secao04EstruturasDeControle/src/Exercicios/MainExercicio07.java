package Exercicios;

import java.util.Scanner;

public class MainExercicio07 {

    public static void main(String[] args) {

        //Criar um programa que enquanto estiver recebendo números positivos,
        // imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.

        Scanner scanner = new Scanner(System.in);

        Double numero = 0.0;
        Double soma = 0.0;

        System.out.println("O programa será encerrando quando infromar um número negativo!");

        while(numero >= 0){
            System.out.print("Informe um número: ");
            String numeroString = scanner.next().replace(",", ".");
            numero = Double.parseDouble(numeroString);
            if(numero >= 0) {
                soma += numero;
                System.out.printf("Adicionado %.2f a soma: %.2f\n", numero, soma);
            } else {
                System.out.println("Soma final: " + soma);
                System.out.println("Programa encerrado!");
                break;
            }
        }

        scanner.close();

    }
}
