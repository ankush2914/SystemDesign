package WeatherMonitorSystemDesign;

public class User {
    private int userId;
    private String userName;
    private NotificationStrategy notificationStrategy;

    public User(int userId, String userName, String strategy) {
        this.userId = userId;
        this.userName = userName;
        this.notificationStrategy = NotificationStrategyFactory.getObject(strategy);
    }

    public void getNotification(int temp){
        notificationStrategy.sendNotification(temp);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public NotificationStrategy getNotificationStrategy() {
        return notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
    
}
