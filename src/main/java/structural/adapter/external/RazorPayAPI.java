package structural.adapter.external;

public class RazorPayAPI {
    public void makePayment(String emal, int phone){
        System.out.println("Making payment via razorpay");
    }

    public RazorPayStatus checkStatus(String paymentId){
        return RazorPayStatus.SUCCESS;
    }
}
