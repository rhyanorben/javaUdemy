package models;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcorreu(Campo campo, CampoEvento evento);

}
