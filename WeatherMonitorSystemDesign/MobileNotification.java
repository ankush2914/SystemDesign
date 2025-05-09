package WeatherMonitorSystemDesign;

public class MobileNotification implements NotificationStrategy {

    @Override
    public void sendNotification(int temp) {
        System.out.println("Mobile Notification: temperature is "+ temp);
    }
    
}
