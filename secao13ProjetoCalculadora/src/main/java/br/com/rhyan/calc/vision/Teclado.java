package br.com.rhyan.calc.vision;

import br.com.rhyan.calc.models.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(99,99,99);
    private final Color COR_LARANJA = new Color(242,163,60);

    public Teclado(){

        GridBagLayout layout = new GridBagLayout(); //Cria um layout de grid "mais personalizável"
        GridBagConstraints c = new GridBagConstraints(); //Define constraints que serão usadas como coordernadas no layout (x,y)

        setLayout(layout);

        c.weightx = 1; //Define o "peso" da altura do botão
        c.weighty = 1; //Define o "peso" da largura do botão //Excepcionalmente foi definido como 3 pois o primeiro botão ocupa o espaço de três
        c.fill = GridBagConstraints.BOTH; //Faz com que as constraints ocupem e espaço inteiro do campo.

        //Linha1
        c.gridwidth = 2; //Define que o botão irá ocupar 3 espaços
        adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
        c.gridwidth = 1; //Volta para o valor padrão
        adicionarBotao("±", COR_CINZA_ESCURO, c, 2, 0);
        adicionarBotao("/", COR_LARANJA, c, 3, 0);

        //Linha2
        adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
        adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
        adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
        adicionarBotao("*", COR_LARANJA, c, 3, 1);

        //Linha3
        adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
        adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
        adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
        adicionarBotao("-", COR_LARANJA, c, 3, 2);

        //Linha4
        adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
        adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
        adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
        adicionarBotao("+", COR_LARANJA, c, 3, 3);

        //Linha5
        c.gridwidth = 2;
        adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
        c.gridwidth = 1;
        adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
        adicionarBotao("=", COR_LARANJA, c, 3, 4);

    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
        //Função para adicionar os botões já passando todos os dados necessários
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, c);
    }

    //Função para verificar os eventos gerados por apertar cada um dos botões
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){ //Verifica se o evento tem origem de um botão (JButton)
            JButton button = (JButton) e.getSource(); //pega a origem do evento e atribui a variável button
            Memoria.getInstancia().processarComando(button.getText());
        }
    }

}
