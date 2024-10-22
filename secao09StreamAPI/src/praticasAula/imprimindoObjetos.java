package praticasAula;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Rhyan", "João", "Jonas", "Henrique");

//        // Usando for
//        for (int i = 0; i < aprovados.size(); i++) {
//            System.out.print(aprovados.get(i));
//        }

//        System.out.println();
//        // Usando foreach
//        for (String nome: aprovados){
//            System.out.println(nome +);
//        }

        //Usando Iterator
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Usando Stream
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }

}
