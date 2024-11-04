package org.example.secao20springboot.models.entities;

public class Calculadora {

    private int a;
    private int b;
    private int resultado;

    public Calculadora() {}

    public Calculadora(int a, int b, int resultado) {
        this.a = a;
        this.b = b;
        this.resultado = resultado;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
