package teste.basico;

import infra.DAO;
import models.basic.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Mochilha", 150.45);

        dao.incluirAtomico(produto).fechar();
    }

}
