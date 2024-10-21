package DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<Item>();

    void adicionarItem(Produto p, int quantidade) {
        Item item = new Item(p, quantidade);
        itens.add(item);
    }

    double obterValorCompra() {
        double total = 0;
        for (Item item : itens) {
            total += (item.quantidade * item.produto.preco);
        }
        return total;
    }


}
