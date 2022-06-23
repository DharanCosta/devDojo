package academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

public class TvShows {
    private String title;
    private int quantEpisodes;

    public TvShows(String title, int quantEpisodes) {
        this.title = title;
        this.quantEpisodes = quantEpisodes;
    }

    @Override
    public String toString() {
        return "TvShows{" +
                "title='" + title + '\'' +
                ", quantEpisodes=" + quantEpisodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantEpisodes() {
        return quantEpisodes;
    }

    public void setQuantEpisodes(int quantEpisodes) {
        this.quantEpisodes = quantEpisodes;
    }
}
