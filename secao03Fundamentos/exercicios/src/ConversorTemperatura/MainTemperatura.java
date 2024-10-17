package ConversorTemperatura;

public class MainTemperatura {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        double novaTemperatura = conversor.converterFarenheit4Celsius(86);

        System.out.println(novaTemperatura);

        novaTemperatura = conversor.converterFarenheit4Celsius(90);

        System.out.println(novaTemperatura);

    }
}