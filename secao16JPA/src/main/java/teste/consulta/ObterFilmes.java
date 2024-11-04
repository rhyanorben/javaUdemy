package teste.consulta;

import infra.DAO;
import models.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<Filme>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 9.0);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }

    }

}
