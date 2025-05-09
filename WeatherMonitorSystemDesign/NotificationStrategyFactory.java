package WeatherMonitorSystemDesign;

public class NotificationStrategyFactory {

    public static NotificationStrategy getObject(String strategy) {
        switch (strategy) {
            case "Email":
                return new EmailNotification();
            case "Mobile": 
                return new MobileNotification();
            default:
                return null;
        }
    }

}
