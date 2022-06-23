package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1-Ordenar LighNovels by title
//2- Retrieve the first 3 light novels with price less than 4
public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlors",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No game, no life",2.99),
            new LightNovel("Fullmetal Alchemist",5.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Monogatari",4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> lightNovelStream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = lightNovelStream.filter(ln -> ln.getPrice()<=4)
                        .count();

        long count1 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() >=4)
                .count();
        System.out.println(count);
        System.out.println(count1);
    }
}
