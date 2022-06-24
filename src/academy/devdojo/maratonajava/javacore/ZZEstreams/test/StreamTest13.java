package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
    //AGRUPAMENTO por preço
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> promotionListMap = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }));
        System.out.println(promotionListMap);

        // Map<Category, Map<Promotion, List <LightNovel>>>
        //Filtrar por categoria e promoção

        Map<Category, Map<Promotion, List<LightNovel>>> categoryPromotionMap = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                })));
        System.out.println(categoryPromotionMap);
    }
}

