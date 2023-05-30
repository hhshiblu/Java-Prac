public class Main {
    int number;
 
    public Main(int number) {
       this.number = number;
    }
 
    public void printNumber() {
       System.out.println("Number: " + number);
    }
 
    public static void main(String[] args) {
       Main obj = new Main(46);
       obj.printNumber();
    }
 }
 
