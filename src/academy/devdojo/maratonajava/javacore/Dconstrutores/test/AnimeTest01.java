package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 15,"Ação","Yakusa");

        anime.imprime();
        System.out.println("------------");

        Anime anime2 = new Anime("HunterXHunter","Netflix", 30,"Drama","Gibi");
        anime2.imprime();
    }
}
