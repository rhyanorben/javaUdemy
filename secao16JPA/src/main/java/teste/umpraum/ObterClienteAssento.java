package teste.umpraum;

import infra.DAO;
import models.umpraum.Assento;
import models.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(3L);
        System.out.println(cliente.getAssento().getNome());
        System.out.println(cliente.getAssento().getCliente().getNome());
        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(1L);

        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();

    }

}
