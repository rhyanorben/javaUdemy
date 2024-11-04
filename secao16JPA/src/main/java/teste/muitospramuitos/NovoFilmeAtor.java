package teste.muitospramuitos;

import infra.DAO;
import models.muitospramuitos.Ator;
import models.muitospramuitos.Filme;

public class NovoFilmeAtor {


    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);

        Filme filme = new Filme("Chorando de Rir", 8.1);
        Ator ator = new Ator("Qualquer Ator");

        ator.addFilme(filme);

        dao.incluirAtomico(filme);

    }

}
