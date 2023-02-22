// package class-4;

public class Employee extends Person{
  private String name;
  private int id;
  private double salary;

  public Employee(String x,int y, double z){
    this.name=x;
    this.id=y;
    this.salary=z;
   }

   public void setName(String x){
    this.name=x;
   }
   public void setId(int y){
    this.id=y;
   }
   public void setSalary(double z){
    this.salary=z;
   }

   public String getName(){
    return name;

   }
   public int getId(){
    return id;

   }
   public double getSalary(){
    return salary;

   }

}
