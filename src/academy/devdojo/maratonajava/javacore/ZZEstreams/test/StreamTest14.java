package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
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
    //AGRUPAMENTO por categoria e contagem
    public static void main(String[] args) {
        Map<Category, Long> collectCount = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collectCount);

        Map<Category, Optional<LightNovel>> collectCategoryMaxPrice = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collectCategoryMaxPrice);

        Map<Category, LightNovel> collectCategoryMaxPrice1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collectCategoryMaxPrice1);

        Map<Category, LightNovel> collectCategoryMaxPrice2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collectCategoryMaxPrice2);
    }

}

