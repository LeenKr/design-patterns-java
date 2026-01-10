public class DigitalProduct implements OrderItem {

    private final double price;

    public DigitalProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
