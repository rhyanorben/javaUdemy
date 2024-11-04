package teste.muitospramuitos;

import infra.DAO;
import models.muitospramuitos.Sobrinho;
import models.muitospramuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

    Tio tio = new Tio("Paulinho");
    Tio tia = new Tio("Marcia");
    Sobrinho sobrinho1 = new Sobrinho("Rhyan");
    Sobrinho sobrinho2 = new Sobrinho("Isadora");

    tia.getSobrinhos().add(sobrinho1);
    sobrinho1.getTios().add(tia);

    tia.getSobrinhos().add(sobrinho2);
    sobrinho2.getTios().add(tia);

    tio.getSobrinhos().add(sobrinho1);
    sobrinho1.getTios().add(tio);

    tio.getSobrinhos().add(sobrinho2);
    sobrinho2.getTios().add(tio);

    DAO<Object> dao = new DAO<>(Object.class);

    dao.abrirT().persistir(tia).persistir(tio).persistir(sobrinho1).persistir(sobrinho2).fecharT().fechar();


    }

}
