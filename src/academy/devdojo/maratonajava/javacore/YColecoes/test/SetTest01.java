package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Attack on titan",19.9,1));
        mangas.add(new Manga(1L,"HunterxHunter",20.5,5));
        mangas.add(new Manga(2L,"Pokémon",69.9,0));
        mangas.add(new Manga(3L,"Dragon Ball Z",45.5,2));
        mangas.add(new Manga(4L,"Naruto",45.5, 0));

        for(Manga manga:mangas){
            System.out.println(manga);
        }
    }
}
