package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Calculando imposto do produto");
        System.out.println("Imposto: "+produto.calcularImposto());

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

//        if(produto instanceof Tomate){
//            String dataValidade = ((Tomate) produto).getDataValidade();
//            System.out.println(dataValidade());
//        }


    }
}
