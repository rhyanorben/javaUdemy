package br.com.rhyan.calc.vision;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto); //Seta o texto passado no construtor
        setOpaque(true); //Define a cor como opaca para cobrir todo background do botão
        setBackground(cor); //Seta a cor passada no parâmetro
        setFont(new Font("courier", Font.PLAIN, 25)); //Define a fonte do texto
        setForeground(Color.WHITE); //Define a cor da fonte
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Cria uma borda preta para cada botão
    }


}
