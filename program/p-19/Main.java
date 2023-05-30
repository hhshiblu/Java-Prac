public class Main extends Exception {

    public Main(String message) {
        super(message);
    }




    public static void main(String[] args) {
        try {
            // Do something that might throw an exception
            throw new Main("This is my custom exception");
        } 
        catch (Main e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }

}