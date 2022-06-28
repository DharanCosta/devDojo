package academy.devdojo.maratonajava.javacore.ZZFTthreads.test;

//final class Anime{
//    private final String name;
//    public String getName() {
//        return name;
//    }
//    Anime(String name) {
//        this.name = name;
//    }
//}

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        //[1] copia e cria uma nova lista
        //[1,2]
        //[1,2,3]
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableRemover = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();

    }
}
