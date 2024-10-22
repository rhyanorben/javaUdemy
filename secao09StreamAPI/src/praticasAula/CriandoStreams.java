package praticasAula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

    // Consumer é uma interface que recebe um valor, mas mão retorna nada;
    Consumer<String> print = System.out::print;
    //Consumer<Integer> println = System.out::println;

    //Criando primeira stream
    Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
    langs.forEach(print);

    //Criando segunda stream
    String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
    Stream.of(maisLangs).forEach(print);

    //Criando terceira stream
    Arrays.stream(maisLangs).forEach(print);

    //Criando quarta stream // Informado intervalo dentro do array
    Arrays.stream(maisLangs, 1, 2).forEach(print);

    //Criando quinta stream
    List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
    outrasLangs.stream().forEach(print);

    //Stream paralela
    outrasLangs.parallelStream().forEach(print);

    //Stream generate
    //Stream.generate(() -> "a").forEach(print); //Utilizado lambda supplier, que não recebe nenhum valor e retorna algo
    //Stream.iterate(0, n -> n = n + 1).forEach(println);

    }
}

