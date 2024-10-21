import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você deseja informar?");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.printf("Informe a %dª nota: ", i + 1);
            double nota = scanner.nextDouble();
            if(nota >+ 0 && nota <= 10){
                notas[i] = nota;
            } else {
                System.out.println("Nota inválida!");
                i--;
            }
        }

        double total = 0.0;
        for(double nota: notas){
            total += nota;
        }

        System.out.printf("Média = %.2f", total/qtdNotas);

        scanner.close();

    }

}
