# Java Desktop com Swing

## O que é Java Swing?

**Java Swing** é uma biblioteca gráfica (GUI) da linguagem de programação Java, usada para criar aplicativos de desktop. Ela faz parte do **Java Foundation Classes (JFC)** e fornece um conjunto de componentes ricos e altamente personalizáveis, como botões, janelas, caixas de texto, tabelas, entre outros.

## Principais Características

- **Portabilidade**: Aplicações desenvolvidas com Java Swing podem ser executadas em qualquer sistema operacional que suporte Java, como Windows, macOS e Linux.
- **Componentes Personalizáveis**: O Swing oferece uma ampla gama de componentes gráficos que podem ser facilmente personalizados, permitindo criar interfaces sofisticadas e adaptadas às necessidades do usuário.
- **Controle Completo**: Através do modelo de **eventos** do Java, é possível ter controle detalhado sobre o comportamento dos componentes, respondendo a ações do usuário como cliques de botão e entradas de texto.
- **MVC (Model-View-Controller)**: Swing é projetado seguindo o padrão **MVC**, o que facilita a separação entre a lógica de negócios e a interface gráfica, permitindo um código mais modular e organizado.

## Quando Utilizar Java Swing?

Java Swing é ideal para:

- **Desenvolver aplicações desktop multiplataforma**.
- **Criar interfaces gráficas ricas e customizadas**, sem depender de bibliotecas de terceiros.
- **Aplicações que não exigem alta performance gráfica**, como softwares de produtividade, ferramentas de gerenciamento e sistemas de automação.

## Estrutura Básica de um Programa Java com Swing

```java
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // Cria uma nova janela (JFrame)
        JFrame frame = new JFrame("Hello World com Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adiciona um rótulo (JLabel) à janela
        JLabel label = new JLabel("Bem-vindo ao Java Swing!", JLabel.CENTER);
        frame.add(label);
        
        // Define o tamanho da janela e a torna visível
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
```
## Vantagens do Java Swing

- **API Amigável**: Simples de usar para desenvolvedores com conhecimentos básicos em Java.
- **Customização Avançada**: Possibilita a criação de interfaces complexas e específicas.
- **Integração com Outras Bibliotecas Java**: Pode ser facilmente integrado a outras bibliotecas Java, como manipulação de arquivos e conexões com bancos de dados.

## Desvantagens do Java Swing

- **Desempenho**: Pode ser mais lento em comparação a frameworks mais modernos e específicos para desktop.
- **Estética**: A aparência dos componentes pode ser considerada simples ou desatualizada quando comparada a interfaces modernas.
- **Curva de Aprendizado**: Pode ser desafiador para iniciantes que não estão familiarizados com o padrão de eventos do Java.

## Recursos Adicionais

- [Documentação Oficial do Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)
