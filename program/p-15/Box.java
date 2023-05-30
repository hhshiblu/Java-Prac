public class Box {
    public double length;
    public double breadth;
    public double height;
  
    public Box() {
      length = breadth = height = 0;
    }
  
    public Box(double length, double breadth, double height) {
      this.length = length;
      this.breadth = breadth;
      this.height = height;
    }
  
    public double getLength() {
      return length;
    }
  
    public void setLength(double length) {
      this.length = length;
    }
  
    public double getBreadth() {
      return breadth;
    }
  
    public void setBreadth(double breadth) {
      this.breadth = breadth;
    }
  
    public double getHeight() {
      return height;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public double getArea() {
      return length * breadth;
    }
  
    public double getVolume() {
      return length * breadth * height;
    }
  }
