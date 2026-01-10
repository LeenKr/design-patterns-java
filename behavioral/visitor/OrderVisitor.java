public interface OrderVisitor {
    void visit(PhysicalProduct product);
    void visit(DigitalProduct product);
    void visit(ServiceItem service);
}
