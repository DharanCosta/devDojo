package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);
//        anime.setGenero("Ação");
        anime.imprime();

        System.out.println("------SOBRECARGA DE VALORES-----");
        anime.init("HunterXHunter","Netflix", 30);
        anime.imprime();

        System.out.println("-----------");
        anime.init("HunterXHunter","Netflix", 30,"Drama");
        anime.imprime();
    }
}
