package mockito;

import notification.Client;
import notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotifcationServiceTestSuite {
    NotificationService notificationService = new NotificationService() {
        @Override
        public void addSubscriber(Client client) {
            NotificationService.super.addSubscriber(client);
        }

        @Override
        public void removeSubscriber(Client client) {
            NotificationService.super.removeSubscriber(client);
        }

        @Override
        public void sendNotification(Notification notification) {
            NotificationService.super.sendNotification(notification);
        }
    };
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void notSubscribedVlientShouldNotReceiveNotification(){
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
    @Test
    public void subsribedClientShouldReceiveNotification(){
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }
    @Test
    public void notificationShouldBeSentToAllSubscribedClient(){
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client1);
        notificationService.addSubscriber(client2);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);

    }
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber(){
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);


    }
    public void unsubscribedClientShouldNotReceiveNotification(){
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}
