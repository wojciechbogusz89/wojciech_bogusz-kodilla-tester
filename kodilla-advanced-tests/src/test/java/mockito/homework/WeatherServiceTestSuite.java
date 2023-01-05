package mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherService weatherAlertService = new WeatherService();
    NotificationAlert notificationAlert = Mockito.mock(NotificationAlert.class);
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @Test//
    public void  notificationCanBeSendToAllUsers() {

        weatherAlertService.addUser(user1, location1);
        weatherAlertService.addUser(user2, location2);

        weatherAlertService.sendNotificationAlertToAllSubscribers(notificationAlert);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notificationAlert);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notificationAlert);

    }

    @Test
    public void UsersShouldReceiveNotificationsFromHisLocation() {
        weatherAlertService.addUser(user1, location1);
        weatherAlertService.addUser(user2, location2);

        weatherAlertService.sendNotification(location1);
        weatherAlertService.sendNotification(location2);
        Mockito.verify(user1, Mockito.times(1)).receive(location1);
        Mockito.verify(user2, Mockito.times(1)).receive(location2)
        ;

    }

    @Test
    public void usersShouldUnsubscribe() {
        weatherAlertService.addUser(user1, location1);
        weatherAlertService.addUser(user2, location2);
        weatherAlertService.removeLocation(location1);
        weatherAlertService.removeLocation(location2);
        Mockito.verify(user1, Mockito.times(0)).receive(location1);
        Mockito.verify(user2, Mockito.times(0)).receive(location2);
    }
    @Test
    public void unsubscribedShouldNotReceiveNotification(){
        Location city1 = Mockito.mock(Location.class);
        User client = Mockito.mock(User.class);
        weatherAlertService.sendNotification(city1);
        Mockito.verify(client, Mockito.never()).receive(city1);

    }

    @Test
    public void shouldDeleteAllSubscription(){
        weatherAlertService.addUser(user1, location1);
        weatherAlertService.addUser(user1, location2);
        weatherAlertService.removeUser(user1,location1);
        weatherAlertService.removeUser(user1,location2);
        Mockito.verify(user1, Mockito.times(0)).receive(location2);
        Mockito.verify(user1, Mockito.times(0)).receive(location1);

    }

}
