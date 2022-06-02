package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Dharan Costa";
        String nome1 = new String("Dharan Costa");
        System.out.println(nome.equals(nome1));

        Smartphone s1 = new Smartphone("1ABC1", "Apple");
        Smartphone s2 = new Smartphone("1ABC1", "Apple");
        System.out.println(s1.equals(s2));
    }
}
