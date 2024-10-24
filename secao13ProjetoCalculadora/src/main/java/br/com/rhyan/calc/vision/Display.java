package br.com.rhyan.calc.vision;

import br.com.rhyan.calc.models.Memoria;
import br.com.rhyan.calc.models.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 50)); //Define a cor do background desse "container"
        label = new JLabel(Memoria.getInstancia().getTextoAtual()); //Cria uma label de texto para testes no display e recebe o valor na memória
        label.setForeground(Color.WHITE); //Define a cor do textoCENTER
        label.setFont(new Font("courier", Font.PLAIN, 30)); //Realiza alteração na fonte do texto

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); //Define o alinhamento do texto (label) a direita / gap de altura / gap de largura

        add(label); //Adiciona a label por meio da herança do JPanel
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor); //Atribui a label de texto o novo valor que foi alterado
    }
}
