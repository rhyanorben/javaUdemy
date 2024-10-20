package DesafioModulo;

public class Jantar {

    // Criar 3 classes: Pessoa, Comida, Jantar
    // Ao chamar o metodo que a pessoa irá comer a comida, o peso da comida deve ser acrescentado a pessoa

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Rhyan";
        p1.peso = 78.0;

        Comida c1 = new Comida();

        c1.nome = "Frango";
        c1.peso = 0.5;

        System.out.println(p1.obterDados(p1));

        p1.comer(p1, c1);

        System.out.println(p1.obterDados(p1));

    }

}
