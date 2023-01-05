package mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherService {
    private Map<User, List<Location>> alertSystem = new HashMap<>();


    public void addUser(User myClient, Location location) {

        List<Location> locationList = new ArrayList<>();

        if (this.alertSystem.containsKey(myClient)) {
            alertSystem.get(myClient).add(location);
        } else {
            locationList.add(location);
            alertSystem.put(myClient, locationList);
        }
    }
    public void removeUser(User myClient, Location location) {

        List<Location> locationList = alertSystem.get(myClient);
        if (locationList != null) {
            locationList.remove(location);
            if (locationList.isEmpty()) {
                alertSystem.remove(myClient);
            }
        }

    }
    public void sendNotification(Location location) {

        alertSystem.entrySet()
                .stream()
                .filter(n -> n.getValue().contains(location))
                .forEach(n -> n.getKey().receive(location));
    }
    public void sendNotificationAlertToAllSubscribers(NotificationAlert notificationAlert) {
        alertSystem.entrySet()
                .stream()
                .forEach(n -> n.getKey().receiveNotification(notificationAlert));
    }

    public void removeLocation(Location location) {
        this.alertSystem.remove(location);
    }
}
