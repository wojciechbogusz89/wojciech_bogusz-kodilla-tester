package mockito.homework;

import mockito.NotificationService;

public interface User {
    void receive(Location location);
    void receiveNotification(NotificationAlert notificationAlert);
}
