package DesafioTriangulo;

import javax.swing.*;

public class MainDesafioTriangulo {
    public static void main(String[] args) {

        // Fórmula = (base * altura) / 2

        String stringBase = JOptionPane.showInputDialog("Digite o valor da base do triângulo: ").replace(",", ".");
        String stringAltura = JOptionPane.showInputDialog("Digite  valor da altura do triângulo: ").replace(",", ".");

        Double base = Double.parseDouble(stringBase);
        Double altura = Double.parseDouble(stringAltura);

        Double area = base * altura / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);

    }
}
