package teste.umpramuitos;

import infra.DAO;
import models.basic.Produto;
import models.umpramuitos.ItemPedido;
import models.umpramuitos.Pedido;

public class AdicionarItemPedido {

    public static void main(String[] args) {

        DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
        DAO<Produto> daoProduto = new DAO<>(Produto.class);
        DAO<ItemPedido> daoItemPedido = new DAO<>(ItemPedido.class);

        ItemPedido itemPedido = new ItemPedido(daoPedido.obterPorId(1L), daoProduto.obterPorId(1L), 2);

        daoItemPedido.abrirT().persistir(itemPedido).fecharT().fechar();

    }

}
