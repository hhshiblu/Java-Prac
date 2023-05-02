public class Administrator extends Employee {
    private String department;

    public Administrator(int employeeID, String name, double salary, String department) {
        super(employeeID, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return super.toString() + ", Administrator in " + department;
    }
}