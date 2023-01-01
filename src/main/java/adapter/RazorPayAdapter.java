package adapter;

import adapter.external.RazorPayAPI;
import adapter.external.RazorPayStatus;
import adapter.interfaces.PaymentProvider;
import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

public class RazorPayAdapter implements PaymentProvider {
    private RazorPayAPI razorPay = new RazorPayAPI();
    @Override
    public void createPayement(PaymentRequest request) {
        razorPay.makePayment(request.getEmail(),request.getPhone());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazorPayStatus status = razorPay.checkStatus(paymentId);
        return toStatus(status);
    }

    private PaymentStatus toStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.SUCCESS){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.ERROR;
    }
}
