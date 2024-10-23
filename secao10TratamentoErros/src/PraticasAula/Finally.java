package PraticasAula;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(7 / + scanner.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("FIM!");

        scanner.close();
    }

}
