public class Main {
    public static void main(String[] args) {
        System.out.println("hello main class");
        // Car obj=new Car();
        // obj.move();
        Circle obj1=new Circle();
        obj1.draw();

        DemoClass obj2=new DemoClass();
        obj2.method1();
        obj2.method2();

        ChildInterClass obj3=new ChildInterClass();
        obj3.childMethod();

        // assingment part 
        
        Employee[] emp = new Employee[4];
        emp[0] = new Professor(1, "atik", 80000000, "CSE");
        emp[1] = new Administrator(2, "hasan", 59845973, "SWE");
        emp[2] = new Professor(3, "shundor ", 793594, "CSE");
        emp[3] = new SupportStaff(4, "pallab", 39989, "Ceo");
        
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }
        
        double totalSalary = Employee.totalSalary(emp);
        System.out.println("Total salary: " + totalSalary);
        
       
      
    }
}
