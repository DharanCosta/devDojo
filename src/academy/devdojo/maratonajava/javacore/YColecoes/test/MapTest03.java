package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 =new Manga(5L,"Attack on titan",19.9);
        Manga manga2 =new Manga(1L,"HunterxHunter",20.5);
        Manga manga3 =new Manga(2L,"Pokémon",69.9);
        Manga manga4 =new Manga(3L,"Dragon Ball Z",45.5);
        Manga manga5 =new Manga(4L, "Naruto", 45.5);


        List<Manga> mangaConsumidorList1 =  List.of( manga1,manga2,manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga3,manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2,mangaConsumidorList2);

        for(Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("--------"+manga.getNome());
            }
            System.out.println(entry.getValue());
        }




    }
}
