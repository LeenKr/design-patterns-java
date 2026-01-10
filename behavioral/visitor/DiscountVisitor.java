public class DiscountVisitor implements OrderVisitor {

    @Override
    public void visit(PhysicalProduct product) {
        System.out.println("Discount on physical product: $20");
    }

    @Override
    public void visit(DigitalProduct product) {
        System.out.println("Discount on digital product: $5");
    }

    @Override
    public void visit(ServiceItem service) {
        System.out.println("No discount on services");
    }
}
