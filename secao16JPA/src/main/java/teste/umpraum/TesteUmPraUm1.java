package teste.umpraum;

import infra.DAO;
import models.umpraum.Assento;
import models.umpraum.Cliente;

public class TesteUmPraUm1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16C");
        Cliente cliente = new Cliente("Ana", assento);

        DAO<Object> dao = new DAO<>(Object.class);

        dao.abrirT().persistir(assento).persistir(cliente).fecharT().fechar();

    }

}
