import java.util.List;

public class OrderClient {

    public static void main(String[] args) {

        List<OrderItem> order = List.of(
                new PhysicalProduct(500),
                new DigitalProduct(100),
                new ServiceItem(50, 4)
        );

        OrderVisitor taxVisitor = new TaxVisitor();
        OrderVisitor discountVisitor = new DiscountVisitor();

        System.out.println("---- TAX CALCULATION ----");
        for (OrderItem item : order) {
            item.accept(taxVisitor);
        }

        System.out.println("\n---- DISCOUNT CALCULATION ----");
        for (OrderItem item : order) {
            item.accept(discountVisitor);
        }
    }
}
