// public class Fibo {

//     public static int fibo(int n) {
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibo(n - 1) + fibo(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(fibo(10)); 
//     }
// }


public class Fibo{

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("The first 10 Fibonacci numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}