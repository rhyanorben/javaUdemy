package DesafioProduto;

public class MainProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "NOTEBOOK";
        produto1.preco = 1500.00;

        Produto produto2 = new Produto("Mesa", 250.25);

        System.out.println("Preço total dos produtos: " + (produto1.preco + produto2.preco));

        System.out.println("Preço líquido dos produtos: " + (produto1.aplicarDesconto() + produto2.aplicarDesconto()));

        Produto.desconto = 0.35;

        System.out.println("Preço total dos produtos: " + (produto1.preco + produto2.preco));

        System.out.println("Preço líquido dos produtos: " + (produto1.aplicarDesconto() + produto2.aplicarDesconto()));

    }
}
