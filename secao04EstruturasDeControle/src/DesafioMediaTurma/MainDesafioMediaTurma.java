package DesafioMediaTurma;

import java.util.Scanner;

public class MainDesafioMediaTurma {

    public static void main(String[] args) {

        //Usuário digita uma nota válida e adiciona a variável total e incremente uma contagem de notas,  para sair deve digitar -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a média da turma.");
        System.out.println("Quando informar todas as notas, digite -1");

        Boolean criterio = true;
        Double somatorio = 0.00;
        int contador = 0;

        while (criterio) {
            System.out.print("Informe uma nota: ");
            String notaString = scanner.next().replace(",", ".");
            Double nota = Double.parseDouble(notaString);
            if (nota >= 0 && nota <= 10){
                somatorio += nota;
                contador++;
            } else if (nota == -1) {
                criterio = false;
            } else {
                System.out.println("Nota inválida!");
            }
        }

        Double media = somatorio/contador;
        System.out.printf("A média da turma é %.2f", media);

        scanner.close();

    }

}
