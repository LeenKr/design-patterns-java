public class CompanyClient {

    public static void main(String[] args) {

        Employee dev1 = new Developer("Alice", 4000);
        Employee dev2 = new Developer("Bob", 4500);
        Employee designer = new Designer("Eve", 3800);

        Manager techLead = new Manager("John");
        techLead.addEmployee(dev1);
        techLead.addEmployee(dev2);

        Manager headManager = new Manager("Sarah");
        headManager.addEmployee(techLead);
        headManager.addEmployee(designer);

        System.out.println("Company Structure:");
        headManager.showDetails();

        System.out.println("\nTotal Salary Cost: $" +
                headManager.calculateSalary());
    }
}
