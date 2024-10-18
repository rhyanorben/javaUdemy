package DesafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterData () {
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }

    String obterData(String nome) {
        String dataFormatada = "Aniversário " + nome + ": " + dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }

}
