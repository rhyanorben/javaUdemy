package models;

import exceptions.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean minado;
    private boolean aberto;
    private boolean marcado;


    private List<Campo> vizinhos = new ArrayList<>();

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo vizinho){

        boolean linhaDiferente = this.linha != vizinho.linha;
        boolean colunaDiferente = this.coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(vizinho.linha - this.linha);
        int deltaColuna = Math.abs(vizinho.coluna - this.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

         if (!diagonal && deltaGeral == 1){
             vizinhos.add(vizinho);
             return true;
         }else if (diagonal && deltaGeral == 2) {
             vizinhos.add(vizinho);
            return true;
         } else {
             return false;
         }
    }

    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrirCampo(){
        if (!aberto && !marcado) {
            aberto = true;
            if (minado){
                throw new ExplosaoException();
            }
            if (vizinhacaSegura()) {
                vizinhos.forEach(v -> v.abrirCampo()); //Abre todos os vizinhos seguros recursivamente.
            }
            return true;
        } else {
            return false;
        }
    }

    boolean vizinhacaSegura(){
        return vizinhos.stream().noneMatch(v -> v.minado); //Verifica vizinhos que não estão minados
    }

    public boolean isMarcado(){
        return marcado;
    }

    public void minar(){
        minado = true;
    }

    void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public boolean isAberto(){
        return aberto;
    }

    public boolean isFechado(){
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isMinado() {
        return minado;
    }

    public boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    long minasNaVizinhaca(){
        return vizinhos.stream().filter( v -> v.minado).count();
    }

    void reiniciar(){
        minado = false;
        aberto = false;
        marcado = false;
    }

    public String toString() {
        if (marcado){
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasNaVizinhaca() > 0){
            return Long.toString(minasNaVizinhaca());
        } else if (aberto){
            return " ";
        } else {
            return "?";
        }
    }
}
