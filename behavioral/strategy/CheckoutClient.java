public class CheckoutClient {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(
                new CreditCardPayment("1234567812345678"));
        context.executePayment(250);

        context.setPaymentStrategy(
                new PayPalPayment("user@example.com"));
        context.executePayment(99.99);

        context.setPaymentStrategy(
                new BankTransferPayment("LB92BLOM12345678901234"));
        context.executePayment(500);
    }
}
