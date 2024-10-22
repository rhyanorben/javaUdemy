package praticasAula;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    public static void main(String[] args) {

        //Reduce é uma função terminal, como o forEach, não é possível utilizar para intermédio ou mesmo inicialização.
        //Reduce retorna um opcional<Integer>, portanto caso não tenha valor inicial ele não vai retornar o Integer, a não ser que siga alguns tratamentos:

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> acumulador = (ac, n) -> ac + n; //Recebe um inteiro e irá retornar o mesmo tipo (inteiro)

        Integer total1 = nums.stream().reduce(acumulador).get(); //utiliza o reduce e get para atribuir o valor acumulado a variavel Integer
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, acumulador); //Como já possui um valor de identidade, entende como um Integer e não precisa do get();
        System.out.println(total2);

        // Para não precisar atribuir a uma váriavel pode ser utilizado o método ifPresent().
        nums.stream().filter(n -> n > 5).reduce(acumulador).ifPresent(System.out::println);

    }

}
