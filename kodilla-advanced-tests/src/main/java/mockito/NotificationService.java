package mockito;

import notification.Client;
import notification.Notification;

import java.util.HashSet;
import java.util.Set;

public interface NotificationService {
    Set<Client> clients = new HashSet<>();

    public default void addSubscriber(Client client){
        clients.add(client);

    }

    public default void  removeSubscriber(Client client){
        this.clients.remove(client);

    }

    public default void  sendNotification(Notification notification){
        clients.forEach(client -> client.receive(notification));
    }
}
