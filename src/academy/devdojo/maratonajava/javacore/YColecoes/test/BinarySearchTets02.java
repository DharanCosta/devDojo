package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTets02 {
    public static void main(String[] args) {
        SortMangaByIdComparator mangaByIdComparator = new SortMangaByIdComparator();
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
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        System.out.println("---------Por nome--------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(4L, "Naruto", 45.5);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByIdComparator));

    }
}
