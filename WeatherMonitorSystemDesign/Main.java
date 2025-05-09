package WeatherMonitorSystemDesign;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(101, "Ankush Verma", "Mobile");
        User u2 = new User(102, "Simran Attree", "Email");
        User u3 = new User(103, "Pawan Oraon", "Email");
        WeatherStation ws1 = new WeatherStation(1010, "Bangalore Weather Department");
        ws1.addUser(u1);
        ws1.addUser(u2);
        ws1.addUser(u3);
        ws1.displayUsers();
        for(int i = 0; i< 10; ++i){
            ws1.updateTemperature();
        }
    }
}