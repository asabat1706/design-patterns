package adapter;

import adapter.external.StripePayAPI;
import adapter.external.StripePayStatus;
import adapter.interfaces.PaymentProvider;
import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

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
