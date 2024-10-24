package br.com.rhyan.calc.vision;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora(){

        organizarLayout();

        setSize(232, 322); //Define a largura e altra da aplicação
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Gera um "taskkill" assim que eu fecho o programa
        setLocationRelativeTo(null); //Seta a localização no meio da tela //Usa a tela do pc como referência (null).
        setVisible(true); //Alterna a visibilidade para que apareça
    }

    private void organizarLayout() {
        //Método para organizar o Layout, chamado no construtor da classe Calculadora
        setLayout(new BorderLayout()); //Seta um novo layout do tipo BorderLayout

        Display display = new Display(); //Instancia a classe display
        add(display, BorderLayout.NORTH); //Adiciona a instancia de display com método 'add' que vem por herança de JPanel
        display.setPreferredSize(new Dimension(233, 60)); //Define um tamanho para o display
        Teclado teclado = new Teclado(); //Instancia a classe teclado
        add(teclado, BorderLayout.CENTER); //Adiciona a instancia de display com método 'add' que vem por herança de JPanel

    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
