package DesafioCuboQuadrado;

import javax.swing.*;
import java.util.Scanner;

public class MainCuboQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Informe um número: ");
        Double num = scanner.nextDouble();*/

        String num = JOptionPane.showInputDialog("Informe um número:").replace(",", ".");

        Double doubleNum = Double.parseDouble(num);

        Double quadrado = Math.pow(doubleNum, 2);
        Double cubo = Math.pow(doubleNum, 3);

        JOptionPane.showMessageDialog(null,
                doubleNum + " elevado ao quadrado = " + quadrado +
                        "\n" + doubleNum + " elevado ao cubo = " + cubo);

        /*System.out.printf("%.2f elevado ao quadrado: %.2f", num, quadrado);
        System.out.printf("\n%.2f elevado ao cubo: %.2f", num, cubo);*/

        scanner.close();

    }
}
