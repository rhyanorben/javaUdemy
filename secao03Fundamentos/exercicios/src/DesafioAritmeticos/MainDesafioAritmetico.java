package DesafioAritmeticos;

public class MainDesafioAritmetico {
    public static void main(String[] args) {

//        int a = 12;
//        int b = (int) Math.pow(a, 3);
//
//        System.out.println(b);

        double numerador1 = (6 * (3 + 2));
        double fracao1Potencia = Math.pow(numerador1, 2);
        double fracao1 = ( fracao1Potencia / (3 * 2));

        double numerador2 = ((1 - 5) * (2 - 7));
        double fracao2 = ( numerador2 / 2) ;
        double fracao2Potencia = Math.pow(fracao2, 2);

        double firstNumerator = 150;
        double secondNumerator = 100;
        double numerator = (firstNumerator - secondNumerator);

        double numeratorPow = Math.pow(numerator, 3);
        double denominatorPow = Math.pow(10, 3);

        double equacao = numeratorPow / denominatorPow;

        System.out.println(equacao);

    }
}
