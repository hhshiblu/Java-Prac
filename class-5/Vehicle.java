public abstract class Vehicle {
    public Vehicle() {
        System.out.println("vehicle");
    }

    public abstract void move();

    public void carry() {
        System.out.println("carry method");
    }

}