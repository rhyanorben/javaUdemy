package praticasAula;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rhyan", 4.0);
        Aluno a2 = new Aluno("Gabriel", 8.0);
        Aluno a3 = new Aluno("Luiz", 10.0);
        Aluno a4 = new Aluno("João", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> comparador = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(comparador).get());
        System.out.println(alunos.stream().min(comparador).get());

    }

}
