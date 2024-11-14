package payment;

public class Skrill implements IPayment{
    @Override
    public void pay() {
        System.out.println("Skrill pay");

    }

    @Override
    public void cancel() {
        System.out.println("Skrill cancel");
    }
}
