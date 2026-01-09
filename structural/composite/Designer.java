public class Designer implements Employee {

    private final String name;
    private final double salary;

    public Designer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Designer: " + name + " | Salary: $" + salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
