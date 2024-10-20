package DesafioModulo;

public class Pessoa {

    // Atributo: Nome, peso,
    // Metodo: comer(entrada: objeto da classe Comida)

    String nome;
    Double peso;

    Pessoa(){}

    Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Pessoa pessoa, Comida comida) {
        System.out.println(pessoa.nome + " comeu " + comida.nome.toLowerCase());
        pessoa.peso = pessoa.peso + comida.peso;
    }

    String obterDados(Pessoa pessoa){
        return String.format("Nome: %s\nPeso: %.2f", pessoa.nome, pessoa.peso);
    }


}
