package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Apple");
        Smartphone s2 = new Smartphone("22226", "Samsung");
        Smartphone s3 = new Smartphone("25232", "Google");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3); // Adicionar em uma posição específica

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("25232", "Google");
        System.out.println(smartphones.contains(s4)); //True or False pra saber se já existe
        System.out.println(smartphones.indexOf(s4));


    }
}
