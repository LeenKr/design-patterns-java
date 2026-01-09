public class BankAdapter implements PaymentProcessor {

    private final BankApi bankApi;

    public BankAdapter(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    @Override
    public void processPayment(double amount) {
        bankApi.sendMoney(amount);
    }
}
