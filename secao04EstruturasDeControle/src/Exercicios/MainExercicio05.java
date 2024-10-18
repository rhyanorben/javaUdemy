package Exercicios;

import java.util.Scanner;

public class MainExercicio05 {
    public static void main(String[] args) {

        // Refatorar o exercício 04, utilizando a estrutura switch.

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

        switch (contadorDivisoes){
            case(2):
                System.out.printf("O número %d é primo!", num);
                break;
            default:
                System.out.println("O número não é primo!");
                break;
        }


        scanner.close();



    }
}
