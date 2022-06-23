package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlors",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No game, no life",2.99),
            new LightNovel("Fullmetal Alchemist",10.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Monogatari",4.00)
    ));

    public static void main(String[] args) {
        // preço menor que 8 anyMatch
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() >8));
        // preço maior do que 0 allMatch
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice()>0));
        // nenhum com preço menor que 0 noneMatch
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice()<0));
        // findAny, não deterministico
        lightNovels.stream()
                .filter(ln -> ln.getPrice()>5)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice()>3)
                .sorted(Comparator.comparing(LightNovel
                ::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice()>3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
