public class Employee {
    private int empID;
    private String name;
    private double salary;

    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee    " + empID + ": " + name + " ($" + salary + ")";
    }

    public static double totalSalary(Employee[] employees) {
        double total = 0.0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}
