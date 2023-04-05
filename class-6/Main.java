public class Main{
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]=30/0;
           String s=null;
        }
      

        catch(ArithmeticException e){
            System.out.println("Aritmatic");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("rest of the code");
    }

}