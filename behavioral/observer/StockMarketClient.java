public class StockMarketClient {

    public static void main(String[] args) {

        Stock appleStock = new Stock("AAPL", 150);

        StockObserver mobileApp = new MobileApp();
        StockObserver emailAlert = new EmailAlert();
       
        appleStock.registerObserver(mobileApp);
        appleStock.registerObserver(emailAlert);

        System.out.println("📊 Stock price update...");
        appleStock.setPrice(95);

        System.out.println("\n📊 Another price update...");
        appleStock.setPrice(120);
    }
}
