package DesafioHeranca.Classes;

public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;

    protected Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public boolean acelerar(){
        if(velocidadeAtual <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += 10;
            return true;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
            return false;
        }
    }

    public boolean freiar(){
        if(velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
            return true;
        } else {
            velocidadeAtual = 0;
            return false;
        }
    }

}
