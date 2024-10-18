package Exercicios;

import java.util.Scanner;

public class MainExercicio06 {

    public static void main(String[] args) {

        //Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado.
        // Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

        Scanner scanner = new Scanner(System.in);

        int numero = 12;
        int numeroEscolhido = 0;
        int i = 0;

        for (i = 1; i <= 10; i++) {
            System.out.printf("Tentativa " + i +  ". Tente a sorte entre 1 e 100: ");
            numeroEscolhido = scanner.nextInt();
            if( numero == numeroEscolhido ) {
                System.out.printf("Você acertou o número (%d)!", numero);
                break;
            } else if (numeroEscolhido > numero && i < 10) {
                System.out.printf("O número é menor que %d\n", numeroEscolhido);
            } else if (numeroEscolhido < numero && i < 10) {
                System.out.printf("O número é maior que %d\n", numeroEscolhido);
            }
        }

        if (i == 11 && numeroEscolhido != numero) {
            System.out.println("Número de tentativas esgotado!");
        }

        scanner.close();


    }

}
