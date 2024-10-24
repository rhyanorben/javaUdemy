package vision;

import models.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.forEach(campo -> add(new BotaoCampo(campo)));

        tabuleiro.setObservadores( e -> {
            SwingUtilities.invokeLater(() -> {
                if (tabuleiro.objetivoAlcancado()) {
                    JOptionPane.showMessageDialog(null, "Ganhou!");
                } else {
                    JOptionPane.showMessageDialog(null, "Perdeu!");
                }
            tabuleiro.reiniciar();
            });
        });
    }
}
