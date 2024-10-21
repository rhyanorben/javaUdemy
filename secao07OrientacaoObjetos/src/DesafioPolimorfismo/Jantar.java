package DesafioPolimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(78);

        Alimento arroz = new Arroz(0.2);
        Alimento feijao = new Feijao(0.5);
        Alimento sorvete = new Sorvete(0.3);

        System.out.println(convidado);

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado);

    }

}
