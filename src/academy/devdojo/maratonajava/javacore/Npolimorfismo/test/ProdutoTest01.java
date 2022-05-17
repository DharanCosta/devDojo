package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7",11000);
        Tomate tomate= new Tomate("Siciliano", 10);
        Televisao televisao= new Televisao("Samsung Smart TV 50\"", 4500);


        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(televisao);


    }
}
