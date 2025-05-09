package BookMyShowSystemDesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieManager mm  = new MovieManager();
        TheatreManager tm = new TheatreManager(mm);
        Theatre t1 = new Theatre(tm, City.BANGALORE, "CENTRO");
        Movie m1 = new Movie(0, "Avengers", 128);
        Movie m2 = new Movie(1, "Iron Man", 120);
        t1.addShows(m2, 9);
        t1.addShows(m2, 12);
        t1.addShows(m1, 4);
        mm.printMovies(City.BANGALORE);
        BookMyShow bms = new BookMyShow();
        User u1 = new User(1, "Ankush");
        t1.printShows();
        List<Show> shows = t1.getShows();
        shows.get(0).showAvailableSeats();
        List<Seat> seats = shows.get(0).availableSeats();
        bms.bookTicket(u1, shows.get(0), seats.get(0));
        bms.bookTicket(u1, shows.get(0), seats.get(0));
    }
}
