// package class-3;





public class Main {
    
    private int age;
    private int year;
    private String Fullname;
     
     public Main(int x,int y,String name){
         System.out.println("Stuent details");
        this.age=x;
        this.year=y;
         this.Fullname=name;
 
     }
     public Main(int x,int y){
         System.out.println("Stuent details");
        this.age=x;
        this.year=y;
        
 
     }
  
     public int info(){
         return age;    
     }
     public int info1(){
         return year;    
     }
     public String info2(){
         return Fullname;    
     }
     public static void main(String[] args) {
         Main obj= new Main(22,2023,"Hasan");
          Main obj1=new Main(40, 60) ;
           System.out.println(obj.age);
           System.out.println(obj.year);
           System.out.println(obj.Fullname);
           System.out.println(obj1.age);
           System.out.println(obj1.year);
 
 //Employee class
 
           Employee obj2=new Employee(5000,"hasanul haque") ;
           System.out.println(obj2.getSalary());
           System.out.println(obj2.getName());
           
           Employee obj3=new Employee();
           System.out.println(obj3.getName());
           System.out.println(obj3.getSalary());
     }
 }
 

// public class Main {
    
//     int x;
//     String name;
//     public Main(){
//         x=5;
//         name="hasan";

//     }
//     public static void main(String[] args) {
//         Main obj= new Main();
//         System.out.println(obj.x + obj.name);

        
//     }
// }


// public class Main {
    
//     int age;
//     int year;
//     String Fullname;
//     public Main(int x,int y,String name){
//         System.out.println("Stuent details");
//        this.age=x;
//        this.year=y;
//         this.Fullname=name;

//     }
//     public static void main(String[] args) {
//         Main obj= new Main(22,2023,"Hasan");
//         System.out.println(obj.age);
//         System.out.println(obj.year);
//         System.out.println(obj.Fullname);
//     }
// }



// public class Main {
    
//     int age;
//     int year;
//     String Fullname;
    
//     public Main(int x,int y,String name){
//         System.out.println("Stuent details");
//        this.age=x;
//        this.year=y;
//         this.Fullname=name;

//     }
//     public void display(){
//         System.out.println(age+" "+year+" " +Fullname);
//     }
//     public int info(){
//         return age,year,Fullname;
     
    
        
//     }
//     public static void main(String[] args) {
//         Main obj= new Main(22,2023,"Hasan");
//           obj.display();
//           System.out.println(obj.age);
//           System.out.println(obj.year);
//     }
// }




