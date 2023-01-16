package mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationServiceTestSuite {
    WeatherService notificationService = new WeatherService();
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    Location city1 = Mockito.mock(Location.class);
    Location city2 = Mockito.mock(Location.class);
    Location city3 = Mockito.mock(Location.class);
    NotificationAlert notificationAlert = Mockito.mock(NotificationAlert.class);

    @Test
    public void subscribedToLocalizationUsersShouldGetNotification() {
        notificationService.addUser(user1,city1);

        notificationService.sendNotificationAlertToLocalization(notificationAlert,city1);

        Mockito.verify(user1).receiveNotification(notificationAlert);

    }
    @Test
    public void userWhoUnsubscribedInLocalizationShouldNotReceiveNotification() {
        notificationService.addUser(user1,city1);
        notificationService.addUser(user1,city2);

        notificationService.removeUserFromLocation(user1, city1);

        notificationService.sendNotificationAlertToLocalization(notificationAlert,city1);
        notificationService.sendNotificationAlertToLocalization(notificationAlert,city2);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notificationAlert);


    }
    @Test
    public void userWhoUnsubscribedInAllLocalizationsShouldNotReceiveNotification () {
        notificationService.addUser(user1,city1);
        notificationService.addUser(user1,city2);
        notificationService.addUser(user1,city3);

        notificationService.removeUser(user1);
        notificationService.sendNotificationAlertToEveryone(notificationAlert);

        Mockito.verify(user1, Mockito.never()).receiveNotification(notificationAlert);


    }
    @Test
    public void shouldSendNotificationOnlyToUsersWhoSubscribedInCorrectLocalization() {
        notificationService.addUser(user1,city1);
        notificationService.addUser(user2,city1);
        notificationService.addUser(user3,city1);
        notificationService.addUser(user1,city3);
        notificationService.addUser(user2,city2);

        notificationService.sendNotificationAlertToLocalization(notificationAlert,city1);

        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notificationAlert);


    }
    @Test
    public void shouldSendNotificationsToEverybody() {
        notificationService.addUser(user2, city2);
        notificationService.addUser(user1,city1);
        notificationService.addUser(user3,city3);
        notificationService.addUser(user2,city1);

        notificationService.sendNotificationAlertToEveryone(notificationAlert);
        Mockito.verify(user2).receiveNotification(notificationAlert);
        Mockito.verify(user1).receiveNotification(notificationAlert);
        Mockito.verify(user3).receiveNotification(notificationAlert);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notificationAlert);

    }
    @Test
    public void shouldDeleteCurrentLocalization() {
        notificationService.addUser(user1,city1);
        notificationService.addUser(user3,city1);
        notificationService.addUser(user2,city1);

        notificationService.removeLocation(city1);
        notificationService.sendNotificationAlertToLocalization(notificationAlert, city1);

        Mockito.verify(user1, Mockito.never()).receiveNotification(notificationAlert);
        Mockito.verify(user3, Mockito.never()).receiveNotification(notificationAlert);
        Mockito.verify(user2, Mockito.never()).receiveNotification(notificationAlert);

    }

}