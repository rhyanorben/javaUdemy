package teste.basico;

import infra.ProdutoDAO;
import models.basic.Produto;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> produtos = dao.obterTodos(10, 0);

        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " | " + produto.getNome() + " | " + produto.getPreco());
        }

        dao.fechar();

    }

}
