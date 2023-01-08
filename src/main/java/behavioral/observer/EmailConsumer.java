package behavioral.observer;

public class EmailConsumer implements Consumer {
    @Override
    public void consume(double price) {
        System.out.println("email notification for price change to : "+ price);
    }
}
