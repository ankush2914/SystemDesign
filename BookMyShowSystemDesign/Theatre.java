package BookMyShowSystemDesign;

import java.util.*;;
public class Theatre {
    List<Show> shows;
    TheatreManager theatreManager;
    City city;
    String name;
    public Theatre(TheatreManager theatreManager, City city, String name) {
        this.theatreManager = theatreManager;
        this.city = city;
        this.name = name;
        shows = new ArrayList<>();
    }
    public void addShows(Movie movie,int startTime){
        List<Seat> seats = new ArrayList<>();
        for(int i =0; i < 10; ++i){
            Seat s1 = new Seat(i, SeatType.SILVER);
            Seat s2 = new Seat(10+i, SeatType.GOLD);
            Seat s3 = new Seat(20+i, SeatType.PLATINUM);
            seats.add(s1);
            seats.add(s2);
            seats.add(s3);
        }
        Show show = new Show(seats, movie, startTime);
        shows.add(show);
        theatreManager.addTheatreAndMovie(this, movie);
    }
    public List<Show> getShows() {
        return shows;
    }
    public void printShows(){
        System.out.println("List of Movies:");
        for(Show show: shows){
            System.out.print("["+show.getMovie().getMovieName()+" time:"+show.getStartTime()+"] ");
        }
        System.out.println();
    }
    public City getCity() {
        return city;
    }
    public String getName() {
        return name;
    }

}
