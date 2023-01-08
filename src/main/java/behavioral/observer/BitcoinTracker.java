package behavioral.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BitcoinTracker extends Publisher{
    private Bitcoin bitcoin;

    public void updatePrice(double price){
        Bitcoin b= bitcoin.toBuilder().price(price).build();
        publish(b);
    }

    @Override
    public void publish(Bitcoin bitcoin1) {
        subscribers.forEach(consumer -> consumer.consume(bitcoin1.getPrice()));
    }
}
