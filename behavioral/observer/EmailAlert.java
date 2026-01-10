public class EmailAlert implements StockObserver {

    @Override
    public void update(String stockName, double price) {
        System.out.println("Email Alert: " + stockName +
                " price is now $" + price);
    }
}
