public class Main {
    public static void main(String[] args) {
      Box box = new Box(10, 20, 30);
      System.out.println("The area of the box is " + box.getArea());
      System.out.println("The volume of the box is " + box.getVolume());
  
      Box3D box3D = new Box3D(10, 20, 30, 40);
      System.out.println("The surface area of the box3D is " + box3D.getSurfaceArea());
      System.out.println("The volume of the box3D is " + box3D.getVolume());
    }
  }
