package DesafioProduto;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {}

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double aplicarDesconto() {
        double precoLiquido = preco * (1 - desconto) ;
        return precoLiquido;
    }

}
