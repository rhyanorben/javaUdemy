package ConversorTemperatura;

public class Conversor {

    // Farenheit para Celsius
    public double converterFarenheit4Celsius(double temperatura){

        double celsius = (temperatura - 32) * 5 / 9;

        return celsius;

    }

}
