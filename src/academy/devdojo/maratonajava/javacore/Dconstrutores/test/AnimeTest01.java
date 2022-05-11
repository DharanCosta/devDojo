package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 15,"Ação");

        anime.imprime();

        Anime anime2 = new Anime("HunterXHunter","Netflix", 30,"Drama");
        anime2.imprime();
    }
}
