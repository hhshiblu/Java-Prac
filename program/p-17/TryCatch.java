public class TryCatch {

    public static void main(String[] args) {
        int array[]={23,3,2,1,2};

        // int[] array = new int[5];

        try {
            System.out.println(array[-81]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" this is error ,index negative");
        } 
        
        finally {
            System.out.println("The finally block is always executed.");
        }
    }
}
