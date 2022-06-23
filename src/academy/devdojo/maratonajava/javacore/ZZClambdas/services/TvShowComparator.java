package academy.devdojo.maratonajava.javacore.ZZClambdas.services;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.TvShows;

public class TvShowComparator {
    public static int compareByTitle(TvShows t1, TvShows t2){
        return t1.getTitle().compareTo(t2.getTitle());
    }
    public static int compareByEpisodes(TvShows t1, TvShows t2){
        return Integer.compare(t1.getQuantEpisodes(),t2.getQuantEpisodes());
    }

    public int compareByEpisodesNonStatic(TvShows t1, TvShows t2){
        return Integer.compare(t1.getQuantEpisodes(),t2.getQuantEpisodes());
    }
}
