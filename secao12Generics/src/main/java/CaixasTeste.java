public class CaixasTeste {

    public static void main(String[] args) {

        //Neste caso não utilizamos o tipo genérico

        Caixa caixa = new Caixa();
        caixa.guardar(2.3);

        Double coisa = (Double) caixa.abrir();
        System.out.println(coisa);

        //Nestes dois casps foi utilizado o tipo genérico
        CaixaGenerica<String> caixaA = new CaixaGenerica<>();
        caixaA.setCaixa("Olá");

        System.out.println(caixaA.getCaixa());

        CaixaGenerica<Double> caixaB = new CaixaGenerica<>();
        caixaB.setCaixa(2.3);
        System.out.println(caixaB.getCaixa());

        //Generics e Herança

        CaixaInt caixaC = new CaixaInt();
        caixaC.setCaixa(777);
        System.out.println(caixaC.getCaixa());

        CaixaNumero<Double> caixaD = new CaixaNumero<>();
        caixaD.setCaixa(3.4);
        System.out.println(caixaD.getCaixa());
    }

}
