package teste.heranca;

import infra.DAO;
import models.heranca.Aluno;
import models.heranca.AlunoBolsista;

public class Alunos {

    public static void main(String[] args) {

        DAO<Aluno> dao = new DAO<>(Aluno.class);

        Aluno aluno1 = new Aluno(202311408L, "Rhyan");
        AlunoBolsista aluno2 = new AlunoBolsista(202311410L, "Kaique", 1560.50);

        dao.incluirAtomico(aluno1);
        dao.incluirAtomico(aluno2);

        dao.fechar();

    }

}
