package observer;

public class Namorada implements ChegadaAniversarianteObserver {

    public void chegou(ChegadaAniversarianteEvent event){
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silêncio");
        System.out.println("Surpresa");
    };

}
