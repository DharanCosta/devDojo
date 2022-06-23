package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.TvShows;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.TvShowComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
    List<TvShows>  tvShowsList = new ArrayList<>(List.of(new TvShows("The Office",150),
                new TvShows("Westworld",35),
                new TvShows("The Boys",42)));

//        Collections.sort(tvShowsList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(tvShowsList, TvShowComparator::compareByTitle);
        tvShowsList.sort(TvShowComparator::compareByEpisodes);
        System.out.println(tvShowsList);
    }
}
