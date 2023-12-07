import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String cinemaName;
    private int ID;
    private List<Movie> movies;
    public Cinema(String cinemaName,int ID) {
        this.cinemaName = cinemaName;
        this.movies = new ArrayList();
        this.ID = ID;
    }
    public String getCinemaName() {
        return this.cinemaName;
    }
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public List<Movie> getMovies() {
        return this.movies;
    }
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }
    public String toString() {
        return "Cinema{cinemaName='" + this.cinemaName + "', movies=" + this.movies + "}";
    }
}


