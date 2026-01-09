public class PaymentClient {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalService());
        paypal.processPayment(150.0);

        PaymentProcessor bank =
                new BankAdapter(new BankApi());
        bank.processPayment(300.0);
    }
}
