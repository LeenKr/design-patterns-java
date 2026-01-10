public class BankTransferPayment implements PaymentStrategy {

    private final String iban;

    public BankTransferPayment(String iban) {
        this.iban = iban;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount +
                " using Bank Transfer (IBAN: " + iban + ")");
    }
}
