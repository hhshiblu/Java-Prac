public class Main{
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.h=10;
        obj.w=5;
        obj.l=10;
        
        obj.Calculate_area(obj.h, obj.w, obj.l);

        obj.Calculate_area(obj.h, obj.w);

    }
}