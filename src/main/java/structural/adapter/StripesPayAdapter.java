package structural.adapter;

import structural.adapter.external.StripePayAPI;
import structural.adapter.external.StripePayStatus;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

public class StripesPayAdapter implements PaymentProvider {

    private StripePayAPI stripePay = new StripePayAPI();

    @Override
    public void createPayement(PaymentRequest request) {
        stripePay.pay(request.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        StripePayStatus status = stripePay.checkStatus(paymentId);
        return getStatus(status);
    }

    private PaymentStatus getStatus(StripePayStatus status) {
        if(status == StripePayStatus.OK){
            return PaymentStatus.SUCCESS;
        }
         return PaymentStatus.ERROR;
    }

}
