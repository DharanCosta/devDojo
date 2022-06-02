package academy.devdojo.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList(); //1.4 DO Java
        nomes.add("Dharan");
        nomes.add("DevDojo");
        //nomes.remove( );
        for(Object nome: nomes){
            System.out.println(nome);
        }

        List<String> nomes1 = new ArrayList<>();
        nomes1.add("Dharan Costa");
        nomes1.add("Dhyana Costa");
        nomes1.addAll(nomes);

        for(Object nome: nomes1){
            System.out.println(nome);
        }
        nomes1.add("Suanes");
        System.out.println("--------");
        for(int i =0; i<nomes1.size();i++){
            System.out.println(nomes1.get(i));
        }

    }
}
