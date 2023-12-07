public class Ticket {
    public String ID;
    private int seatNumber;
    private String showtime;
    private double price;
    private Movie movie;

    public String getID() {
        return this.ID;
    }

    public Ticket(int seatNumber, String showtime, double price, Movie movie) {
        this.seatNumber = seatNumber;
        this.showtime = showtime;
        this.price = price;
        this.movie = movie;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public String getShowtime() {
        return this.showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Ticket{seatNumber=" + this.seatNumber + ", showtime='" + this.showtime + "', price=" + this.price + "}";
    }

}
