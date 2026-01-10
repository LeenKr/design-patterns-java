public class ServiceItem implements OrderItem {

    private final double hourlyRate;
    private final int hours;

    public ServiceItem(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getTotalCost() {
        return hourlyRate * hours;
    }

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
