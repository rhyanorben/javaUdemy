package DesafioHeranca.Classes;

public class Ferrari extends Carro {

    public Ferrari(){
        super(200);
    }

    public boolean acelerar(){
        if(velocidadeAtual <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += 15;
            return true;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
            return false;
        }
    }

    public boolean freiar(){
        if(velocidadeAtual >= 15) {
            velocidadeAtual -= 15;
            return true;
        } else {
            velocidadeAtual = 0;
            return false;
        }
    }

}
