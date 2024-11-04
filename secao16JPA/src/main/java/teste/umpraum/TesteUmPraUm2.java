package teste.umpraum;

import infra.DAO;
import models.umpraum.Assento;
import models.umpraum.Cliente;

public class TesteUmPraUm2 {

    public static void main(String[] args) {

        Assento assento = new Assento("7E");
        Cliente cliente = new Cliente("Rhyan", assento);

        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        dao.incluirAtomico(cliente);

    }

}
