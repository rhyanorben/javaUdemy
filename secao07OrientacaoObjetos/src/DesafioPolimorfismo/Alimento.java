package DesafioPolimorfismo;

public class Alimento {

    private double peso;

    Alimento(double peso) {
        setPeso(peso);
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
}
