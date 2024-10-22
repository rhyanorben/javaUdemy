package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        //Interface Constumer = Recebe um valor e não retorna nada
        Consumer<String> print = System.out::print;

        //Criação da lista
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        System.out.println("Método 1");
        //Criação Stream e posteriormente Map para fazer uma modificação
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";


        System.out.println("\nMétodo 2");
        marcas.stream().map(maiuscula.andThen(primeiraLetra).andThen(grito)).forEach(print);

        System.out.println("\nMétodo 3");
        marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);

    }
}
