public interface OrderItem {
    void accept(OrderVisitor visitor);
}
