package Assingment;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Professor(1, "John Smith", 80000.0, "Computer Science");
        employees[1] = new Administrator(2, "Jane Doe", 50000.0, "Human Resources");
        employees[2] = new Professor(3, "David Johnson", 75000.0, "Mathematics");
        employees[3] = new SupportStaff(4, "Sarah Lee", 30000.0, "Receptionist");

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Total salary: $" + Employee.totalSalary(employees));
    }
}