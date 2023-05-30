public class Exceptions extends Exception {

    public Exceptions(String message) {
        super(message);
    }

    public static String divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return String.valueOf(a / b);
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
