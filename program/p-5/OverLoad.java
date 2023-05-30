

public class OverLoad {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

        public static void main(String[] args) {
            System.out.println(add(67, 678)); // Prints 3
            System.out.println(add(134, 67, 433)); // Prints 6
        }
    
     
    }

