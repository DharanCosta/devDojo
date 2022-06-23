package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

//1-Ordenar LighNovels by title
//2- Retrieve the first 3 light novels with price less than 4
public class StreamTest04 {
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
       List<List<String>> devDojo = new ArrayList<>();
       List<String> graphicDesigners = List.of("Willian", "Catarina", "Sandy");
       List<String> developers = List.of("Willian", "David", "Harisson");
       List<String> studenst = List.of("Carlos","Édipo", "Guilherme");
       devDojo.add(graphicDesigners);
       devDojo.add(developers);
       devDojo.add(studenst);
       for (List<String> people : devDojo) {
           for (String person : people) {
                System.out.println(person);
            }
        }
       System.out.println("-------------");
       devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
