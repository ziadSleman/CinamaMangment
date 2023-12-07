import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int movieId;
    private String title;
    private String genre;
    private List<String> showtimes;

    public Movie(int movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.showtimes = new ArrayList();
    }

    public int getMovieId() {
        return this.movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getShowtimes() {
        return this.showtimes;
    }

    public void setShowtimes(List<String> showtimes) {
        this.showtimes = showtimes;
    }

    public void addShowtime(String showtime) {
        this.showtimes.add(showtime);
    }

    public String toString() {
        return "Movie{movieId =" + this.movieId + ", title ='" + this.title + "', genre ='" + this.genre + "', showtimes =" + this.showtimes + "}";
    }
}
