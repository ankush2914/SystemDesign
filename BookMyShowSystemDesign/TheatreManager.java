package BookMyShowSystemDesign;

import java.util.*;

public class TheatreManager {
    MovieManager movieManager;
    Map<Theatre, Set<Movie>> theatreMovieMap;
    Map<Movie,Set<Theatre>> movieTheatreMap;
    
    public TheatreManager(MovieManager movieManager) {
        this.movieManager = movieManager;
        theatreMovieMap = new HashMap<>();
        movieTheatreMap = new HashMap<>();
    }

    public List<Movie> getMovieLists(Theatre theatre) {
        List<Movie> listOfMovies = new ArrayList<>();
        for(Movie movie: theatreMovieMap.get(theatre)){
            listOfMovies.add(movie);
        }
        return listOfMovies;
    }
    public List<Theatre> getCityList(Movie movie) {
        List<Theatre> listOfTheatres = new ArrayList<>();
        for(Theatre theatre: movieTheatreMap.get(movie)){
            listOfTheatres.add(theatre);
        }
        return listOfTheatres;
    }

    public void addTheatreAndMovie(Theatre theatre, Movie movie) {
        movieTheatreMap.computeIfAbsent(movie, k -> new HashSet<>()).add(theatre);
        theatreMovieMap.computeIfAbsent(theatre, k -> new HashSet<>()).add(movie);
        movieManager.addMovies(movie, theatre.getCity());
    }
    void printMovies(Theatre theatre){
        System.out.println("List of Movies in "+theatre.getName());
        for(Movie movie: theatreMovieMap.get(theatre)){
            System.out.print("["+movie.getMovieName()+"]");
        }
        System.out.println();
    }
}
