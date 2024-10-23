import java.util.List;

public class ListaUtil {

    //Utilizando o "?" na indicação do tipo da lista, posso receber uma lista de qualquer tipo e retornar o último elemento.
    public static <T> T getUltimo1(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    //Posso definir mais tipos genéricos para utilizar como parametros de entrada ou parametro de retorno.
    public static <A, B, C> C teste(A param1, B param2){
        C teste = null;
        return teste;
    }

}
