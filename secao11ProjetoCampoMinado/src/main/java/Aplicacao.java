import models.Tabuleiro;
import vision.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 2);
        new TabuleiroConsole(tabuleiro);
    }

}
