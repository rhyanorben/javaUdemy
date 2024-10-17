package AreaCircunferencia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAreaCircunferencia {
    public static void main(String[] args) {
        System.out.println("Primeiro Programa Parte 01");
        System.out.println("Primeiro Programa Parte 02");

        AreaCircunferencia areaCircunferencia = new AreaCircunferencia();

        double area = areaCircunferencia.calcularArea(3.4);
        System.out.println("Area: " + area + ".m2");
    }
}