package vision;

import models.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
        PainelTabuleiro painel = new PainelTabuleiro(tabuleiro);
        add(painel);

        setTitle("Campo Minado");
        setVisible(true);
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new TelaPrincipal();

    }

}
