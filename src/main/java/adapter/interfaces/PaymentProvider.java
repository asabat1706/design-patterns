package adapter.interfaces;

import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

//Step1: Create adapter interface
public interface PaymentProvider {

    public void createPayement(PaymentRequest request);

    public PaymentStatus verifyStatus(String paymentId);
}
