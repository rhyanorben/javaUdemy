package DesafioPolimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public void comer(Alimento alimento){
        this.peso = this.getPeso() + alimento.getPeso();
    }

    public String toString(){
        return "Olá, tenho " + getPeso() + "kgs.";
    }

}
