package teste.umpramuitos;

import infra.DAO;
import models.umpramuitos.ItemPedido;
import models.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

    DAO<Pedido> dao = new DAO<>(Pedido.class);
    Pedido pedido = dao.obterPorId(1L);

    for(ItemPedido item: pedido.getItens()){
        System.out.println(item.getProduto().getNome() + " | " + item.getQuantidade() + " | " + item.getPreco());
    }

    }

}
