package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    List<Consumer> subscribers = new ArrayList<>();

    public abstract void publish(Bitcoin bitcoin);

    public void subscribe(Consumer consumerAlert){
        subscribers.add(consumerAlert);
    }

    public void unsubscribe(Consumer consumerAlert){
        subscribers.remove(consumerAlert);
    }
}
