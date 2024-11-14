package payment;

public class PaymentController{

    private IPayment payment;

    public PaymentController(IPayment payment){
        this.payment = payment;
    }
    public void pay(){
        this.payment.pay();
    }
}
