package mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface WeatherNotificationService {
    Map<Localization, Set<User>> localizationUserMap = new HashMap<>();

    public default void sendToAll(Notification notification) {
        localizationUserMap.forEach(
                (localization, users) -> users.forEach(user -> user.receive(notification))
        );
    }

    public default void sendToUsersSubscribedToLocalization(Localization localization, Notification notification) {
        localizationUserMap.get(localization).forEach(user -> user.receive(notification));
    }

    public default void addLocalization(Localization localization) {
        localizationUserMap.put(localization, new HashSet<>());
    }

    public default void removeLocalization(Localization localization) { localizationUserMap.remove(localization); }

    public default void subscribeToLocalization(Localization localization, User user) { localizationUserMap.get(localization).add(user); }

    public default void unsubscribeFromLocalization(Localization localization, User user) { localizationUserMap.get(localization).remove(user); }

    public default void unsubscribeFromAll(User user) {
        localizationUserMap.forEach((localization, users) -> users.remove(user));
    }
}

