package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(1L,"HunterxHunter",20.5));
        mangas.add(new Manga(2L,"Pokémon",69.9));
        mangas.add(new Manga(3L,"Dragon Ball Z",45.5));
        mangas.add(new Manga(4L, "Naruto", 45.5));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
