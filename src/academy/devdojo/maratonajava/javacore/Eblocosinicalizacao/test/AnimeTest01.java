package academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + "");
        }


    }

}
