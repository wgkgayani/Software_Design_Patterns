package payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new PaymentAdapter(new PayPal());

        payment.pay(5000);
    }
}