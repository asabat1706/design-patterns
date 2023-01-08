package structural.adapter;

import structural.adapter.external.RazorPayAPI;
import structural.adapter.external.RazorPayStatus;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

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
