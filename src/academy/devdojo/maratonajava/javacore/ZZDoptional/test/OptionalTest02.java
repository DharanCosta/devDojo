package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
//        MangaRepository.findByTitle("Naruto").ifPresent(m -> m.setTitle("Naruto Legends"));
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto");
        mangaByTitle.ifPresent(m -> m.setTitle("Naruto Legends"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(3)
                .orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepository.findByTitle("Drifiters")
                .orElseGet(() -> new Manga(3, "Drifiters", 20));
        System.out.println(newManga);
    }
}
