package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99, Category.FANTASY),
            new LightNovel("Overlors",3.99,Category.FANTASY),
            new LightNovel("Violet Evergarden",5.99, Category.DRAMA ),
            new LightNovel("No game, no life",2.99 , Category.FANTASY),
            new LightNovel("Fullmetal Alchemist",10.99, Category.FANTASY),
            new LightNovel("Kumo desuga",1.99, Category.FANTASY),
            new LightNovel("Kumo desuga",1.99, Category.FANTASY),
            new LightNovel("Monogatari",4.00, Category.ROMANCE)
    ));
    //Parallels Streams
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumLongParalleltreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result =0;
        long init = System.currentTimeMillis();
        for (long i = 1; i<= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result +" "+(end-init)+"ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result +" "+(end-init)+"ms");
    }
    //Execução em múltiplas threads
    // 1 - 1-5
    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result +" "+(end-init)+"ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum Long Stream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result +" "+(end-init)+"ms");
    }

    private static void sumLongParalleltreamIterate(long num){
        System.out.println("Sum Long Parallel Stream Iterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result +" "+(end-init)+"ms");
    }

}

