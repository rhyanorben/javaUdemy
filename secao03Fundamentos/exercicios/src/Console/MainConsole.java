package Console;

import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {

        System.out.print("Hello World");
        System.out.print("Hello World");

        System.out.printf("Megasena: %d %d %d %d %d %d %d",
                1, 2, 3, 4, 5, 6, 7);
        System.out.println();
        System.out.printf("Salário: %.1f\n", 1234.5678);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome);

        Boolean bo = Boolean.parseBoolean("true");
        bo.toString();

        Character c = '#';
        c.toString();


        scanner.close();

    }
}
