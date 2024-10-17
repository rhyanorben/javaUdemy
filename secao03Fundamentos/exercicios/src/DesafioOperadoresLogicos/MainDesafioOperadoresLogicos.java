package DesafioOperadoresLogicos;

public class MainDesafioOperadoresLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        //Se os dois trabalhos derem certo, irei comprar uma TV de 50º
        //Se os um dos trabalhos der certo, irei comprar uma TV de 32º
        //Nos dois casos, irei ao shopping com a familia

        //No cenário em que nenhum dos dois derem certo, nada será feito.

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if (trabalho1 && trabalho2) {
            System.out.println("Comprei uma TV de 50 polegadas e fui ao shopping com a familia");
        }

        if (trabalho1 ^ trabalho2) {
            System.out.println("Comprei uma TV de 32 polegadas e fui ao shopping com a familia");
        }

        if (!trabalho1  && !trabalho2) {
            System.out.println("Não fizemos nada!");
        }



    }
}
