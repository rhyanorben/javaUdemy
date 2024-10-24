package models;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean minado;
    private boolean aberto;
    private boolean marcado;


    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>();

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public void setObservador(CampoObservador observador){
        observadores.add(observador);
    }

    private void notificarObservadores(CampoEvento evento){
        observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
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

    public void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
            if (marcado){
                notificarObservadores(CampoEvento.MARCAR);
            } else {
                notificarObservadores(CampoEvento.DESMARCAR);
            }
        }
    }

    public boolean abrirCampo(){
        if (!aberto && !marcado) {
            setAberto(true);
            if (minado){
                notificarObservadores(CampoEvento.EXPLODIR);
                return true;
            }

            if (vizinhacaSegura()) {
                vizinhos.forEach(v -> v.abrirCampo()); //Abre todos os vizinhos seguros recursivamente.
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean vizinhacaSegura(){
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
        if (aberto){
            notificarObservadores(CampoEvento.ABRIR);
        }
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

    public int minasNaVizinhaca(){
        return (int) vizinhos.stream().filter( v -> v.minado).count();
    }

    void reiniciar(){
        minado = false;
        aberto = false;
        marcado = false;
        notificarObservadores(CampoEvento.REINICIAR);
    }
}
