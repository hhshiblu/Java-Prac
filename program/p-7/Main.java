public class Main {

    public static void main(String[] args) {
        Shape object = new Shape();
        object.draw();
        object.erase();
        
        Shape shape = new Circle();
        shape.draw();
        shape.erase();

        Shape obj = new Triangle();
        obj.draw();
        obj.erase();

        Shape obj1 = new Square();
        obj1.draw();
        obj1.erase();
    }
}
