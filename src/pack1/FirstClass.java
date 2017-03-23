package pack1;

/**
 * Created by admin on 23.02.2017.
 */
public class FirstClass {
    int int1 = 1;
    double doubleo = 66.8;
    boolean popo = true;
    String pop = "text";


    public static String nameOfMethod(){
            int secondDigit = 5;
            return "method"+secondDigit;
    }

    public static void main(String[] args) {
         String helloWorld = "Hello world";
         String hello = "hello";
         String world = "world";
         String sum = hello+world;


         int digit1 = 5;
         int digit2 = 6;
         System.out.println((digit1-digit2));

         if((digit1+digit2) >11){
             System.out.println("yes");
         }else
        System.out.println("no");
    }
}
