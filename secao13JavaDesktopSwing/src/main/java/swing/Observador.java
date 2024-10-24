package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador"); //Criado uma janela Observador
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definido operação padrão de fechamento
        janela.setSize(600, 200); //Definido tamanho da janela
        janela.setLayout(new FlowLayout()); //Setado um layout para o botão não cobrir a tela inteira
        janela.setLocationRelativeTo(null); //Centralizar a janela de acordo com a tela do computador (quando informado null)

        JButton botao = new JButton("Clicar!"); //Criação de um botão
        janela.add(botao); //Adicionado botão na janela

        //Evento que verifica a existência de um evento e a partir disso pode executar uma ação.
        botao.addActionListener( e -> {
            System.out.println("Evento ocorreu!");
        });

        janela.setVisible(true); //Alterado visibilidade para janela aparecer

    }

}
