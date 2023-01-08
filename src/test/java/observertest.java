import behavioral.observer.Bitcoin;
import behavioral.observer.BitcoinTracker;
import behavioral.observer.Consumer;
import behavioral.observer.EmailConsumer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class observertest {
    BitcoinTracker tracker;

    @Before
    public void setup(){
        tracker = new BitcoinTracker(Bitcoin.builder().price(100).build());
    }

    @Test
    public void testEmailNotification(){
        EmailConsumer email = new EmailConsumer();
        tracker.subscribe(email);
        tracker.updatePrice(120);
        tracker.unsubscribe(email);
    }
}
