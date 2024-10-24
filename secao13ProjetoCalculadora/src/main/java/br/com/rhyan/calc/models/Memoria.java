package br.com.rhyan.calc.models;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    ///Definido uma enum dentro da própria com os comandos que serão utilizados
    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, PLUSMINUS;
    }

    /* Foi criado uma classe memória em que ela só foi instanciada dentro da própria classe e não é possível instanciá-la
    * novamente. Dessa forma terá que utilizar o getInstancia().getMemoria() para buscar a informação na memória*/

    private static Memoria instancia = new Memoria();

    private TipoComando ultimaOperacao;
    private boolean substituir;
    private String textoAtual = "";
    private String textoBuffer = "";

    private List<MemoriaObservador> observadores = new ArrayList<>(); //Lista de observadores da classe

    private Memoria() {}

    public static Memoria getInstancia() {
        return instancia;
    }

    // Método para adicionar um observador a lista da classe de observadores
    public void adicionarObservador(MemoriaObservador observador){
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }


    //Assim que o processar o comando atribuindo novo valor, cada um dos observadores será notificado pelo forEach no método abaixo
    public void processarComando(String comando) {

        TipoComando tipoComando = detectarTipoComando(comando);

        if(tipoComando == null){
            return;
        } else if (tipoComando == tipoComando.ZERAR){
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == tipoComando.NUMERO || tipoComando == tipoComando.VIRGULA){
            textoAtual = substituir ? comando : textoAtual + comando;
            substituir = false;
        } else if (tipoComando == TipoComando.PLUSMINUS && textoAtual.contains("-")){
            textoAtual = textoAtual.substring(1);
        } else if (tipoComando == TipoComando.PLUSMINUS && !textoAtual.contains("-")){
            textoAtual = "-" + textoAtual;
        } else {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
            return textoAtual;
        }
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
        double resultado = 0;

        if (ultimaOperacao == TipoComando.SOMA) {
            resultado = numeroBuffer + numeroAtual;
        } else if (ultimaOperacao == TipoComando.DIV) {
            resultado = numeroBuffer / numeroAtual;
        } else if (ultimaOperacao == TipoComando.MULT) {
            resultado = numeroBuffer * numeroAtual;
        } else if (ultimaOperacao == TipoComando.SUB) {
            resultado = numeroBuffer - numeroAtual;
        }
        String resultadoString = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoString.endsWith(",0");
        return inteiro ? resultadoString.replace(",0", "") : resultadoString;

    }

    private TipoComando detectarTipoComando(String comando){
        if(textoAtual.isEmpty() && comando == "0"){
            return null;
        }
        try {
            Integer.parseInt(comando);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            //Quando não for número
            if("AC".equals(comando)){
                return TipoComando.ZERAR;
            } else if("/".equals(comando)){
                return TipoComando.DIV;
            } else if("*".equals(comando)){
                return TipoComando.MULT;
            } else if("-".equals(comando)){
                return TipoComando.SUB;
            } else if("+".equals(comando)){
                return TipoComando.SOMA;
            } else if("=".equals(comando)){
                return TipoComando.IGUAL;
            } else if(",".equals(comando) && !textoAtual.contains(",")){
                return TipoComando.VIRGULA;
            } else if ("±".equals(comando)){
                return TipoComando.PLUSMINUS;
            }
            return null;
        }
    }
}
