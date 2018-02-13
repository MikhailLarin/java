import ru.stqa.pft.senbox.Reqtangle;
import ru.stqa.pft.senbox.Square;

public class java1 {
   public static void main(String[] args) {
       hello("world");
       hello("user");

       Square s=new Square();
       s.l=5;
       System.out.println(s.l+"="+area(s));
       Reqtangle r=new Reqtangle();
       r.a=4;
       r.b=6;
       System.out.println(r.a+" и "+r.b+'='+area(r));
   }
   public static void hello(String somebody){
       System.out.println("Hello "+somebody+"!");
   }
   public static double area(Square s){
       return s.l*s.l;

   }

   public static double area (Reqtangle r){
       return r.a*r.b;
   }



}
