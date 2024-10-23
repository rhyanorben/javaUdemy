package PraticasAula;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;
//        imprimirNomeAluno(a1); //NullPointerException

//        System.out.println(7 / 0); //Arithmetic Exception

        try {
            imprimirNomeAluno(a1);
        } catch (Exception e) { //Tratado de forma genérica
            System.out.println("Ocorreu um erro ao imprimir nome do usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) { //Tratado especifico para Arithmetic
            System.out.println("Ocorreu o erro: " + e.getMessage());;
        }


        System.out.println("FIM!");

    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}
