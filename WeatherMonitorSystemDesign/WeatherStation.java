package WeatherMonitorSystemDesign;

import java.util.*;
public class WeatherStation {
    private int weatherStationId;
    private String weatherStationName;
    private List<User> users;

    public WeatherStation(int weatherStationId, String weatherStationName){
        this.weatherStationId = weatherStationId;
        this.weatherStationName = weatherStationName;
        users = new ArrayList<>();
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public int getWeatherStationId() {
        return weatherStationId;
    }

    public String getWeatherStationName() {
        return weatherStationName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void updateTemperature(){
        Random r1 = new Random();
        int temp = r1.nextInt(0,56);
        this.notifyUser(temp);
    }
    private void notifyUser(int temp){
        for(User user:users){
            user.getNotification(temp);
        }
    }
    public void displayUsers(){
        for(User user: users){
            System.out.print("["+ user.getUserName()+"] ");
        }
        System.out.println();
    }
}
