package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rhyan", 4.0);
        Aluno a2 = new Aluno("Gabriel", 8.0);
        Aluno a3 = new Aluno("Luiz", 10.0);
        Aluno a4 = new Aluno("João", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado)); //Todos aprovados?
        System.out.println(alunos.stream().anyMatch(aprovado)); //Algum aprovado?
        System.out.println(alunos.stream().noneMatch(aprovado)); //Nenhum aprovado?
        System.out.println(alunos.stream().anyMatch(reprovado)); //Algum reprovado?

    }

}
