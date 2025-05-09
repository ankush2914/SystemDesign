package WeatherMonitorSystemDesign;

public class EmailNotification  implements NotificationStrategy{

    @Override
    public void sendNotification(int temp) {
        System.out.println("Email Notification: temperature is "+ temp);
    }
    
}
