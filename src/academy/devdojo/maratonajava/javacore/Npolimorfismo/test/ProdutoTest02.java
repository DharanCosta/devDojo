package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000 );
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------");
        Produto produto1 = new Tomate("Americano",20 );
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println();
        System.out.println(produto1.calcularImposto());
    }
}
