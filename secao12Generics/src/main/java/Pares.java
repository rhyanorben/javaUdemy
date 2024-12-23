import java.util.*;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new HashSet<>();

    public void adicionar(C chave, V valor){
        if(chave == null) return;

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave){
        if(chave == null) return null;
        Optional<Par<C, V>> opcional = itens.stream().filter(n -> chave.equals(n.getChave())).findFirst();
        return opcional.isPresent() ? opcional.get().getValor() : null;
    }
}
