package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortMangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MagasSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(1L,"HunterxHunter",20.5));
        mangas.add(new Manga(2L,"Pokémon",69.9));
        mangas.add(new Manga(3L,"Dragon Ball Z",45.5));
        mangas.add(new Manga(4L,"Naruto",45.5));

        System.out.println("---------Como inserimos--------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("---------Por nome--------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas, new SortMangaByIdComparator());
//        mangas.sort(new SortMangaByIdComparator()); outra maneira de chamar o método Sort
        System.out.println("-------Por Id no Comparator----------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
