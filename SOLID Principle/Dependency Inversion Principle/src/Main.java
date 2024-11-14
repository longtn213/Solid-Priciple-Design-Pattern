import database.DatabaseController;
import database.OracleDatabase;
import payment.PayPal;
import payment.PaymentController;

public class Main {
    public static void main(String[] args) {
//        DatabaseController controller =  new DatabaseController(new OracleDatabase());
//        controller.connect();
//        controller.disconnect();

        PaymentController paymentController = new PaymentController(new PayPal());

        paymentController.pay();
    }
}