package DesafioDiaDaSemana;

import java.util.Locale;
import java.util.Scanner;

public class MainDesafioDiaDaSemana {
    public static void main(String[] args) {

        //Desafio consiste no usuário fornecer um dia da semana e eu retornar o númnero correspondente ao dia escolhido.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um dia da semana: ");
        String dia = scanner.next();

        dia = dia.toLowerCase().replace("ç", "c").replace("á", "a");

        if(dia.equals("domingo")){
            System.out.println("1");
        } else if(dia.equals("segunda")){
            System.out.println("2");
        } else if(dia.equals("terca")){
            System.out.println("3");
        } else if(dia.equals("quarta")){
            System.out.println("4");
        } else if(dia.equals("quinta")){
            System.out.println("5");
        } else if(dia.equals("sexta")){
            System.out.println("6");
        } else if(dia.equals("sabado")){
            System.out.println("7");
        } else {
            System.out.println("Dia inválido, informe seguindo formatação: \"domingo\", \"segunda\", ... ");
        }

        System.out.println("FIM!");
    }
}
