package DesafioData;

public class MainData {

    public static void main(String[] args) {

        Data data1 = new Data();
        Data data2 = new Data();

        data1.dia = 23;
        data1.mes = 1;
        data1.ano = 2004;

        data2.dia = 12;
        data2.mes = 8;
        data2.ano = 2008;

        System.out.println(data1.obterData());
        System.out.println(data2.obterData());
        System.out.println(data1.obterData("Rhyan"));
        System.out.println(data2.obterData("Isadora"));

        Data data3 = new Data();
        System.out.println(data3.obterData());
        Data data4 = new Data(1, 2, 2005);
        System.out.println(data4.obterData());


    }

}
