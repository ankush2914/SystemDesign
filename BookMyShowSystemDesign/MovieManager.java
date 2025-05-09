package BookMyShowSystemDesign;

import java.util.*;
public class MovieManager {
    Map<Movie,Set<City>> movieCityMap;
    Map<City, Set<Movie>> cityMovieMap;
    public MovieManager() {
        movieCityMap = new HashMap<>();
        cityMovieMap = new HashMap<>();
    }
    public List<Movie> getMovieLists(City city) {
        List<Movie> listOfMovies = new ArrayList<>();
        for(Movie movie: cityMovieMap.get(city)){
            listOfMovies.add(movie);
        }
        return listOfMovies;
    }
    public List<City> getCityList(Movie movie) {
        List<City> listOfCities = new ArrayList<>();
        for(City city: movieCityMap.get(movie)){
            listOfCities.add(city);
        }
        return listOfCities;
    }
    public void addMovies(Movie movie, City city){
        movieCityMap.computeIfAbsent(movie, k -> new HashSet<>()).add(city);
        cityMovieMap.computeIfAbsent(city, k -> new HashSet<>()).add(movie);
    }
    void printMovies(City city){
        System.out.println("List of Movies in "+city);
        for(Movie movie: cityMovieMap.get(city)){
            System.out.print("["+movie.getMovieName()+"]");
        }
        System.out.println();
    }
}
