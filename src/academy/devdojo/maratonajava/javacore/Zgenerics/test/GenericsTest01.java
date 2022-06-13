package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Avatar");
//        lista.add(123L);
//        lista.add(new Consumidor("Goku"));
//        for(Object o : lista){
//            if(o instanceof Long){
//                System.out.println(o);
//            }
//        }
        List<String> list1 = new ArrayList<>();
        list1.add("Midoriya");
        list1.add("Avatar");
        for(String o : list1){
                System.out.println(o);
        }
        add(list1, new Consumidor("Willian"));
        for(String o : list1){
            System.out.println(o);
        }
    }

    private static void add (List list, Consumidor consumidor){
        list.add(consumidor);
    }
}
