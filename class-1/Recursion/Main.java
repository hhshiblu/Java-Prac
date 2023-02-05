public class Main{
      
public static int fac( int a) {
    if(a==0)
    return 1;
    else
    return a*fac(a-1);


    
}
public static void main( String[] ars) {
    System.out.println(fac(5));  
}
}





