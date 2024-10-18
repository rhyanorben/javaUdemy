package Exercicios;

import java.util.Scanner;

public class MainExercicio02 {

    public static void main(String[] args) {

        // Criar um programa informa se o ano atual é um ano bissexto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de ano bissexto!");
        System.out.print("Informe um ano: ");
        Integer ano = scanner.nextInt();

        if (ano % 4 == 0){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        scanner.close();


    }

}
