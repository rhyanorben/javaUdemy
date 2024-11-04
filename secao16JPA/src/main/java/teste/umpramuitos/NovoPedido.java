package teste.umpramuitos;

import infra.DAO;
import infra.ProdutoDAO;
import models.basic.Produto;
import models.umpramuitos.ItemPedido;
import models.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {

        ProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto("Caderno", 18.5);

        daoProduto.abrirT().persistir(produto).fecharT().fechar();

        DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
        Pedido pedido = new Pedido();
        daoPedido.abrirT().persistir(pedido).fecharT().fechar();

        DAO<ItemPedido> daoItemPedido = new DAO<>(ItemPedido.class);
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 5);
        daoItemPedido.abrirT().persistir(itemPedido).fecharT().fechar();

    }

}
