public class ParesTeste {

    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Rhyan");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(3, "Pedro");
        resultadoConcurso.adicionar(2, "Jonas");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(3));
    }

}
