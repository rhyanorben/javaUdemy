package DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainDesafioFilter {

    public static void main(String[] args) {

        Funcionario kiko = new Funcionario("Kiko");
        Funcionario claudio = new Funcionario("Claudio");
        Funcionario miro = new Funcionario("Miro");
        Funcionario jose = new Funcionario("José");

        List<Funcionario> funcionarios = Arrays.asList(kiko, claudio, miro, jose);

//        System.out.println("Antes do sistema informar as faltas: ");
//        funcionarios.stream().forEach(System.out::println);

        kiko.faltar();
        kiko.faltar();
        kiko.faltar();
        kiko.diaExtra();
        kiko.diaExtra();
        kiko.diaExtra();
        kiko.diaExtra();
        miro.faltar();
        miro.faltar();
        claudio.faltar();
        claudio.faltar();
        claudio.diaExtra();
        claudio.diaExtra();
        jose.faltar();
        jose.faltar();
        jose.diaExtra();

//        System.out.println("\n\nDepois do sistema informar as faltas: ");
//        funcionarios.stream().forEach(System.out::println);

        // Verifica se o funcionário tem 2 ou mais faltas
        Predicate<Funcionario> dispensado = n -> n.getFaltas() >= 2 && n.getDiasExtra() < n.getFaltas(); //Recebe um objeto e retorna um boolean
        // Gera mensagem da dispensão
        Function<Funcionario, String> mensagemDispensado = //Recebe um objeto e pode retornar outro
                n -> n.getNome() + " você foi dispensado por faltar " + n.getFaltas() + " vezes e não repôr todos os dias. Tchau!";

        funcionarios.stream().filter(dispensado).map(mensagemDispensado).forEach(System.out::println);

    }

}
