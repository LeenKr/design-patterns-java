public class TaxVisitor implements OrderVisitor {

    @Override
    public void visit(PhysicalProduct product) {
        double tax = product.getPrice() * 0.15;
        System.out.println("Tax on physical product: $" + tax);
    }

    @Override
    public void visit(DigitalProduct product) {
        double tax = product.getPrice() * 0.05;
        System.out.println("Tax on digital product: $" + tax);
    }

    @Override
    public void visit(ServiceItem service) {
        double tax = service.getTotalCost() * 0.10;
        System.out.println("Tax on service: $" + tax);
    }
}
