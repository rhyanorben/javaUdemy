package DesafioFor;

public class MainDesafioFor {

    public static void main(String[] args) {
//
//        String valor = "#";
//
//        for (int i = 1; i <= 5; i++){
//            System.out.println(valor);
//            valor += "#";
//        }

        //Versão do desafio
        //Não pode usar valor numérico para controlar o laço

        for (String valor2 = "#"; !valor2 .equals("######"); valor2 += "#") {
            System.out.println(valor2);
        }

    }

}
