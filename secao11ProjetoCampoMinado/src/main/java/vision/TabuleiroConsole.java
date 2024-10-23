package vision;

import exceptions.ExplosaoException;
import exceptions.SairException;
import models.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    Scanner scanner = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean executar = true;
            while (executar) {
                cicloDoJogo();

                System.out.println("Quer fazer outra partida? (S/n) ");
                String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("n")) {
                    executar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException sair) {
            System.out.println("Tchau!!!");
        } finally {
            scanner.close();
        }
    }

    private void cicloDoJogo() {
        try {

            while(!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x, y): ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

                digitado = capturarValorDigitado("1- Abrir\n2- Marcar");
                if(digitado.equals("1")){
                    tabuleiro.abrir(xy.next(), xy.next());
                } else if (digitado.equals("2")) {
                    tabuleiro.marcar(xy.next(), xy.next());
                }
            }
            System.out.println(tabuleiro);
            System.out.println("Você ganhou!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você perdeu!");
        }
    }

    private String capturarValorDigitado(String texto){
        System.out.println(texto);
        String digitado = scanner.nextLine();

        if("sair".equals(digitado)){
            throw new SairException();
        }
        return digitado;
    }

}
