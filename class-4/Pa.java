public class Pa {
    public static void main(String[] args) {
        int x=3,y=4;
        System.out.println(x%y+" "+x/y);
        m1();
        System.out.println(x%y+" "+x/y);
        System.out.println(x=y);

        
    }
    public static void m1(){
        int x=12,y=5;
        System.out.println(x%y+" "+x/y);
        x+=20;
        y+=x-10;
        System.out.println(x=y);
    }
     
}
