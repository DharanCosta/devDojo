package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.TvShows;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.TvShowComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<TvShowComparator> newTvShowComparator = TvShowComparator::new;
        TvShowComparator tvShowComparator = newTvShowComparator.get();
        List<TvShows>  tvShowsList = new ArrayList<>(List.of(new TvShows("The Office",150),
                new TvShows("Westworld",35),
                new TvShows("The Boys",42)));
        tvShowsList.sort(tvShowComparator:: compareByEpisodesNonStatic);
        System.out.println(tvShowsList);

        BiFunction<String, Integer, TvShows> tvShowsBiFunction = (title,episodes) -> new TvShows(title,episodes);
        BiFunction<String, Integer, TvShows> tvShowsBiFunction2 = TvShows::new;
        System.out.println(tvShowsBiFunction2.apply("Once Upon a Time", 95));


    }
}
