package ru.stqa.pft.senbox;

import ru.stqa.pft.senbox.Reqtangle;
import ru.stqa.pft.senbox.Square;

public class java1 {
   public static void main(String[] args) {
       hello("world");
       hello("user");

       Square s=new Square(5);

       System.out.println(s.l+"="+s.area());
       Reqtangle r=new Reqtangle(4,6);

       System.out.println(r.a+" и "+r.b+'='+r.area());
   }
   public static void hello(String somebody){
       System.out.println("Hello "+somebody+"!");
   }



}
