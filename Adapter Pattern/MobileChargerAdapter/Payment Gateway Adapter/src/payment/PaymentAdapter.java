package payment;

class PaymentAdapter implements Payment {

    private PayPal paypal;

    public PaymentAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    public void pay(double amount) {
        paypal.sendPayment(amount); // translate
    }
}