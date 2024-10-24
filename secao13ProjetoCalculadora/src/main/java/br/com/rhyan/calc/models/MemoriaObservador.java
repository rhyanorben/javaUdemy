package br.com.rhyan.calc.models;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);

}
