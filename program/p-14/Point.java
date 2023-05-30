public class Point {
    private int x;
    private int y;
  
    public Point() {
        x = 0;
        y = 0;
    }
  
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
  
    public void setX(int x) {
        this.x = x;
    }
  
    public void setY(int y) {
        this.y = y;
    }
  
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
  
    public int getX() {
        return x;
    }
  
    public int getY() {
        return y;
    }
  
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(37634276, 183483478);
      
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}
