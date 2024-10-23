package PraticasAula.PersonalizadaA;

import PraticasAula.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7);

        try {
            Validar.aluno(a1);
            Validar.aluno(null);
        } catch (StringVaziaException e){
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e){ //Também é possível informar duas exceções no mesmo catch
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");

    }

}
