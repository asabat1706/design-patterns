package adapter.external;

public class StripePayAPI {
    public void pay(String email){
        System.out.println("Making payment via stripe pay");
    }

    public StripePayStatus checkStatus(String paymentId){
        return StripePayStatus.OK;
    }
}
