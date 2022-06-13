package academy.devdojo.maratonajava.javacore.YColecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTets01 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");
        fila.add("C");
        for (String s : fila) {
            System.out.println(s);
        }

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
