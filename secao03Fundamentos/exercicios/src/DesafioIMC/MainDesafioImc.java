package DesafioIMC;

import javax.swing.*;
import java.util.Scanner;

public class MainDesafioImc {

    public static void main(String[] args) {

        // Fórmula = peso / (altura * altura)
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Informe o seu peso: ");
        Double peso = scanner.nextDouble();*/

        /*System.out.println("Informe a sua altura em cm: ");
        double altura = scanner.nextDouble();
        altura /= 100;*/

        /*System.out.println("Informe sua altura em m: ");
        String stringAltura = scanner.next().replaceAll(",", ".");
        Double altura = Double.parseDouble(stringAltura); */

        String stringPeso = JOptionPane.showInputDialog("Informe seu peso: ").replace(",", ".");
        double peso = Double.parseDouble(stringPeso);

        String stringAltura = JOptionPane.showInputDialog("Informe sua altura: ").replace(",", ".");
        double altura = Double.parseDouble(stringAltura);

        Double imc = peso / (altura * altura) ;
        //System.out.printf("Seu IMC é %.2f", imc);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);

    }
}
