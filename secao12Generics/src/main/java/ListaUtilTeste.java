import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("PHP", "Python", "C", "Java");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        String ultimaLinguagem = ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);
        Integer ultimoNumero = ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);
    }

}
