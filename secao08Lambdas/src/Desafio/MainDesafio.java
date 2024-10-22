package Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainDesafio {

    public static void main(String[] args) {


    Produto p = new Produto("Notebook", 3000, 0.2);

    /*
    * A partir do produto calcular o preco real (com desconto)
    * Imposto municipal: >= 2500 (8,5%) / < 2500 (Isento)
    * Frete >= 3000 (100) / < 3000 (50)
    * Arredondar: deixar duas casas decimais
    * Formatar: R$1234,56
    * */

        Function<Produto, Double> precoFinal = preco -> p.preco * (1 - p.desconto); //Function para aplicar o desconto
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco; //Operador Unário para verificar se há imposto, caso tenha: calcular
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50; //Operador Unário para verificar valor do frete e adicionar
//        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", ".")); //Operador unário para arrendodar valor
        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco); //Function para realizar formatação do valor

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete)/*.andThen(arredondar)*/.andThen(formatar).apply(p);
        System.out.println("O preço final é: " + preco);

    }
}
