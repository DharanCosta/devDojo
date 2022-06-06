package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.YColecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Attack on titan",19.9,1));
        mangas.add(new Manga(1L,"HunterxHunter",20.5,5));
        mangas.add(new Manga(2L,"Pokémon",69.9,0));
        mangas.add(new Manga(3L,"Dragon Ball Z",48.5,2));
        mangas.add(new Manga(4L,"Naruto",45.5, 0));
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 23, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("---------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //retira 1 da lista no caso o 1º
        System.out.println(mangas.pollLast()); //retira 1 da lista no caso o último

    }
}
