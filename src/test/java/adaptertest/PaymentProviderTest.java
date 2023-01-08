package adaptertest;

import structural.adapter.*;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaymentProviderTest {
    private PaymentProvider paymentProvider;

    @Before
    public void setup(){
        paymentProvider = new RazorPayAdapter();
    }

    @Test
    public void testPayMode(){
        Assert.assertTrue("Instance is razor pay", paymentProvider instanceof RazorPayAdapter);
    }

    @Test
    public void testPayment(){
        PaymentRequest paymentRequest = PaymentRequest.builder().
                email("test").
                phone(1234).
                build();
        paymentProvider.createPayement(paymentRequest);
    }

    @Test
    public void testStatus(){
        Assert.assertEquals(PaymentStatus.SUCCESS,paymentProvider.verifyStatus("123"));;
    }
}
