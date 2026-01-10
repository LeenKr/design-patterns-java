public class PhysicalProduct implements OrderItem {

    private final double price;

    public PhysicalProduct(double price) {
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
