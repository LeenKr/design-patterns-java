public class Developer implements Employee {

    private final String name;
    private final double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + " | Salary: $" + salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
