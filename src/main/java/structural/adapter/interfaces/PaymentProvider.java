package structural.adapter.interfaces;

import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

//Step1: Create structural.adapter interface
public interface PaymentProvider {

    public void createPayement(PaymentRequest request);

    public PaymentStatus verifyStatus(String paymentId);
}
