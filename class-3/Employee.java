public class Employee  {
    private double salary;

    private String name;

    public Employee() {
        this.salary = 30000000;
        this.name = "hasanul haque";
    }

    public Employee(double x, String b) {
        System.out.println("Student details");
        this.salary = x;
        this.name = b;

    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    

}
