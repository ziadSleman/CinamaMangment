import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ticketing {
    private User user;
    private Movie movie;
    private String showTime;
    private int seatNumber;
    private List<Ticket> bookedTickets = new ArrayList();
    public Ticketing(User user, Movie movie, String showTime, int seatNumber) {
        this.user = user;
        this.showTime = showTime;
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    public void bookTicket(User user, Movie movie, String showTime, int seatNumber) {
        if (!this.isSeatBooked(movie, showTime, seatNumber)) {
            Ticket bookedTicket = new Ticket(seatNumber, showTime, 520.0, movie);
            this.bookedTickets.add(bookedTicket);

            try {
                FileDeal writer = new FileDeal();

                try {
                    String string = "Movie: " + movie + ", Showtime: " + bookedTicket.getShowtime() + ", Seat: " + bookedTicket.getSeatNumber();
                    String previousContent = FileDeal.readFile("\\info\\booking_log.txt");
//                    if (previousContent != null) {
//                        previousContent.makeConcatWithConstants<invokedynamic>(previousContent, string);
//                    }

                    FileDeal.createFile("\\info", "booking_log.txt", string);
                } catch (Throwable var11) {
                    try {
                        writer.close();
                    } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                    }

                    throw var11;
                }

                writer.close();
            } catch (Exception var12) {
                var12.printStackTrace();
            }
        } else {
            System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
        }

    }
    private boolean isSeatBooked(Movie movie, String showtime, int seatNumber) {
        Iterator var4 = this.bookedTickets.iterator();

        Ticket bookedTicket;
        do {
            if (!var4.hasNext()) {
                return false;
            }

            bookedTicket = (Ticket)var4.next();
        } while(bookedTicket.getSeatNumber() != seatNumber || !bookedTicket.getShowtime().equals(showtime));

        return true;
    }
    public void cancelTicket(int seatNumber) {}
}
