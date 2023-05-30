public class Box3D extends Box {
    private double depth;
  
    public Box3D() {
        super();
        depth = 0;
    }
  
    public Box3D(double length, double breadth, double height, double depth) {
        super(length, breadth, height);
        this.depth = depth;
    }
  
    public double getDepth() {
        return depth;
    }
  
    public void setDepth(double depth) {
        this.depth = depth;
    }
  
    public double getSurfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
  
    @Override
    public double getVolume() {
        return length * breadth * height * depth;
    }
}