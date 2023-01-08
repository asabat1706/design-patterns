package behavioral.observer;

public class TweetConsumer implements Consumer {

    @Override
    public void consume(double price) {
        System.out.println("tweet notification for price change to : "+ price);
    }
}
