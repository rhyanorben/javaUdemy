package DesafioCelsiusFarenheit;

import java.util.Scanner;

public class MainCelsiusFarenheit {
    public static void main(String[] args) {

        // Fórmula: (0 °C × 9/5) + 32 = 32 °F

        System.out.println("Informe o número em Celsius que deseja em converter para Farenheit: ");
        Scanner entrada = new Scanner(System.in);
        Double celsius = entrada.nextDouble();

        Double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "º convertido para Fahrenheit: " + fahrenheit + "º");


    }
}
