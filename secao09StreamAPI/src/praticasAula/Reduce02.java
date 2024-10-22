package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rhyan", 4.0);
        Aluno a2 = new Aluno("Gabriel", 8.0);
        Aluno a3 = new Aluno("Luiz", 10.0);
        Aluno a4 = new Aluno("João", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = n -> n.nota >= 7;
        Function<Aluno, Double> nota = n -> n.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream().filter(aprovado).map(nota).reduce(somatorio).ifPresent(System.out::println);

    }

}
