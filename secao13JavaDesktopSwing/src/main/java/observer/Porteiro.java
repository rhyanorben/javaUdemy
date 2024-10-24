package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void adicionarObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        while(true){
        int digitado = scanner.nextInt();
        if (digitado == 1){
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                for (ChegadaAniversarianteObserver observer : observers) {
                    observer.chegou(event);
                }
                //Notificar
            } else {
            System.out.println("Alarme Falso!");
        }

        }


    }

}
