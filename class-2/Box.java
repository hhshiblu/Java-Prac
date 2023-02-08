public class Box {
  public  int height ;
  public   int width ;
  public   int length ;

    public static void Calculate_area(int height,int width,int length) {
        
        System.out.println(height * width * length);
    }
    public static void Calculate_area(int height,int width) {
        
        System.out.println(height * width );
    }

    public void display() {

        System.out.println(height);
        System.out.println(width);
        System.out.println(length);
    }

    public static void main(String[] args) {
       
        Calculate_area(5,10,10);
        Calculate_area(2, 20);

        Box obj1 = new Box();
        obj1.height = 30;
        obj1.width = 10;
        obj1.length = 5;
        obj1.display();
    }
}
