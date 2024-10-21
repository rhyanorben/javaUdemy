package DesafioComposicao;

public class MainDesafioComposicao {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Feijao", 15.00);
        Produto produto2 = new Produto("Arroz", 20.00);
        Produto produto3 = new Produto("batata", 10.00);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarItem(produto2, 2);
        compra1.adicionarItem(produto1, 1);

        compra2.adicionarItem(produto3, 1);
        compra2.adicionarItem(produto2, 3);

        Cliente cliente1 = new Cliente("Rhyan");

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        int index = 1;
        for (Compra compra : cliente1.compras){
            System.out.println("Valor da compra " +  index + ": R$"+ compra.obterValorCompra());
            index++;
        }

        System.out.println("Valor total de compras: R$"  + cliente1.obterValorTotal());

    }
}
