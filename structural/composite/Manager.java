import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private final String name;
    private final List<Employee> subordinates = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee e : subordinates) {
            e.showDetails();
        }
    }

    @Override
    public double calculateSalary() {
        double total = 0;
        for (Employee e : subordinates) {
            total += e.calculateSalary();
        }
        return total;
    }
}
