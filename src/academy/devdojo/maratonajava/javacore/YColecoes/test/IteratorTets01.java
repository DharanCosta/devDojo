package academy.devdojo.maratonajava.javacore.YColecoes.test;

import academy.devdojo.maratonajava.javacore.YColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTets01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan",19.9,1));
        mangas.add(new Manga(1L,"HunterxHunter",20.5,5));
        mangas.add(new Manga(2L,"Pokémon",69.9,0));
        mangas.add(new Manga(3L,"Dragon Ball Z",45.5,2));
        mangas.add(new Manga(4L,"Naruto",45.5, 0));
// Forma não adequada de remover
//        for(Manga manga:mangas){
//            if(manga.getQuantidade() ==0){
//                mangas.remove(manga);
//            }
//        }
        // Com Iterator
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() ==0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() ==0);


        System.out.println(mangas);



    }
}
