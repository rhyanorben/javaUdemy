package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

    private final Date dataChegada;

    public EventoChegadaAniversariante(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getDataChegada() {
        return dataChegada;
    }
}
