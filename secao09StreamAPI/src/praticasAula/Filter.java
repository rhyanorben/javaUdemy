package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rhyan", 7.2);
        Aluno a2 = new Aluno("Augusto", 3.5);
        Aluno a3 = new Aluno("Bruna", 8.2);
        Aluno a4 = new Aluno("Luiz", 10);
        Aluno a5 = new Aluno("Gabriel", 4.5);
        Aluno a6 = new Aluno("João", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        //Aceita um objeto como entrada e retorna um Boolean
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        //Recebe o obejto aluno e retorna uma string personalizada
        Function<Aluno, String> mensagem = a -> a.nome + ", parabéns! Você foi aprovado. Nota: " + a.nota;

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }

}
