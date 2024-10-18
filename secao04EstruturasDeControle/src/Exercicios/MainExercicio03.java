package Exercicios;

import java.util.Scanner;

public class MainExercicio03 {

    public static void main(String[] args) {

        //Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0
        // imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

        Scanner scanner = new Scanner(System.in);

        Boolean criterio1 = true;
        Boolean criterio2 = true;
        Double nota1 = 0.0;
        Double nota2 = 0.0;


        while(criterio1) {
                System.out.print("Informe a primeira nota: ");
                String nota1String = scanner.nextLine().replace(",", ".");
                nota1 = Double.parseDouble(nota1String);
                if(nota1 >= 0 && nota1 <= 10) {
                    criterio1 = false;
                } else {
                    System.out.println("Informe uma nota válida!");
                }
        }

        while(criterio2) {
            System.out.print("Informe a segunda nota: ");
            String nota2String = scanner.nextLine().replace(",", ".");
            nota2 = Double.parseDouble(nota2String);
            if (nota2 >= 0 && nota2 <= 10) {
                criterio2 = false;
            } else {
                System.out.println("Informe uma nota válida!");
            }
        }

        Double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f! ", media);
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media >= 4 ) {
            System.out.println("Recuperação!");
        } else if (media < 4) {
            System.out.println("Reprovado");
        }

        scanner.close();

    }
}
