package DesafioHeranca.Main;

import DesafioHeranca.Classes.Carro;
import DesafioHeranca.Classes.Civic;
import DesafioHeranca.Classes.Ferrari;

public class MainDesafioHeranca {

    public static void main(String[] args) {


        Carro ferrari = new Ferrari();
        Carro civic = new Civic();

        System.out.println("Velocidade atual Ferrari: " + ferrari.velocidadeAtual);
        System.out.println("Velocidade atual Civic: " + civic.velocidadeAtual);

        ferrari.freiar();
        civic.freiar();

        System.out.println("Velocidade atual Ferrari: " + ferrari.velocidadeAtual);
        System.out.println("Velocidade atual Civic: " + civic.velocidadeAtual);

        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();

        System.out.println("Velocidade atual Ferrari: " + ferrari.velocidadeAtual);
        System.out.println("Velocidade atual Civic: " + civic.velocidadeAtual);

        ferrari.freiar();
        civic.freiar();
        ferrari.freiar();
        civic.freiar();
        ferrari.freiar();
        civic.freiar();

        System.out.println("Velocidade atual Ferrari: " + ferrari.velocidadeAtual);
        System.out.println("Velocidade atual Civic: " + civic.velocidadeAtual);

    }

}
