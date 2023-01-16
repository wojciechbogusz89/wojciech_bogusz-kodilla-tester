package mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherService {

    public Map<User, List<Location>> userLocationMap = new HashMap<>();

    public void addUser(User user, Location location) {
        List<Location> locationList = userLocationMap.getOrDefault(user, new ArrayList<>());
        locationList.add(location);
        this.userLocationMap.put(user, locationList);

    }

    public void removeUserFromLocation(User user, Location location) {
        List<Location> locationList = userLocationMap.getOrDefault(user, new ArrayList<>());
        locationList.remove(location);
        this.userLocationMap.put(user, locationList);
    }

    public void removeUser(User user) {
        this.userLocationMap.remove(user);
    }

    public void removeLocation(Location location) {
        for (Map.Entry<User, List<Location>> entry : userLocationMap.entrySet()) {
            removeUserFromLocation(entry.getKey(), location);
        }
    }

    public void sendNotificationAlertToLocalization(NotificationAlert notificationAlert, Location location) {
        List<User> user = userLocationMap.entrySet()
                .stream()
                .filter(userListEntry -> userListEntry.getValue().contains(location))
                .map(userListEntry -> userListEntry.getKey())
                .collect(Collectors.toList());
        user.forEach(users -> users.receiveNotification(notificationAlert));

    }

    public void sendNotificationAlertToEveryone(NotificationAlert notificationAlert) {
        List<User> users = userLocationMap.entrySet()
                .stream()
                .map(userListEntry -> userListEntry.getKey()).collect(Collectors.toList());
        users.forEach(client -> client.receiveNotification(notificationAlert));
    }
}


