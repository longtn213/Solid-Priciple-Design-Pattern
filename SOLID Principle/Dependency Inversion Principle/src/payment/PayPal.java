package payment;

public class PayPal implements IPayment{
    @Override
    public void pay() {
        System.out.println("Paypal pay");

    }

    @Override
    public void cancel() {
        System.out.println("Paypal pay cancel");
    }
}
