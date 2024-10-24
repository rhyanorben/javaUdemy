package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Porteiro porteiro = new Porteiro();
        Namorada namorada = new Namorada();

        porteiro.setObservadores(namorada);
        porteiro.monitorar();
    }

}
