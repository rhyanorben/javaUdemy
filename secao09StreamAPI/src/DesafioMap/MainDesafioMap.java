package DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainDesafioMap {

    public static void main(String[] args) {

        // Função para imprimir valores
        Consumer<Integer> printInteger = s -> System.out.print(s + ", ");
        Consumer<String> printString = s -> System.out.print(s + ", ");

        //Criação Lista do Desafio
        List <Integer> listaNums = Arrays.asList(1, 2, 3, 4, 5, 6 ,7 ,8, 9);

        //Mostrando os números
        listaNums.stream().forEach(printInteger);

        //Transformar número inteiro para binário
        Function<Integer, String> conversorBinario = n -> String.format("%3s", Integer.toBinaryString(n)).replace(" ", "0");

        System.out.println("\n\nVerificando transformação para binário");
        listaNums.stream().map(conversorBinario).forEach(printString);

        //Inverter número binário
        Function<String, String> inverterBinario = n -> new StringBuilder(n).reverse().toString();

        System.out.println("\n\nVerificando inversão");
        listaNums.stream().map(conversorBinario).map(inverterBinario).forEach(printString);

        //Transformar número binário para inteiro
        Function<String, Integer> conversorInteiro = n -> Integer.parseInt(n, 2);

        System.out.println("\n\nVerificando transformação para inteiro");
        listaNums.stream().map(conversorBinario).map(inverterBinario).map(conversorInteiro).forEach(printInteger);

    }

}
