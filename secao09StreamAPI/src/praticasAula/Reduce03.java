package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rhyan", 4.0);
        Aluno a2 = new Aluno("Gabriel", 8.0);
        Aluno a3 = new Aluno("Luiz", 10.0);
        Aluno a4 = new Aluno("João", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionarNota(nota);
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println(media.getMedia());

    }

}
