package payment;

public class Payoneer implements IPayment{
    @Override
    public void pay() {
        System.out.println("Payoneer method");
    }

    @Override
    public void cancel() {
        System.out.println("Payoneer method cancel");
    }
}
