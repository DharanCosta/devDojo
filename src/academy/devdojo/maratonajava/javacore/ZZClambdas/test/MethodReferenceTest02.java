package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.TvShows;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.TvShowComparator;

import java.util.ArrayList;
import java.util.List;
//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        TvShowComparator tvShowComparator = new TvShowComparator();
        List<TvShows>  tvShowsList = new ArrayList<>(List.of(new TvShows("The Office",150),
                new TvShows("Westworld",35),
                new TvShows("The Boys",42)));
        tvShowsList.sort(tvShowComparator:: compareByEpisodesNonStatic);
//        tvShowsList.sort((t1,t2) -> tvShowComparator.compareByEpisodesNonStatic(t1,t2));
        System.out.println(tvShowsList);
    }
}
