import java.util.Scanner;
public class A{
    int min=400;
    int max=600;
        double a=Math.random()*(max-min+1)+min;
}
public class B extends A{
    
        int b=(int)(Math.random()*(max-min+1)+min);

        public static void main(String args[]){
            B bi=new B();
            System.out.println("randam  number is :" +a);
            System.out.println("randam number is :" +b);
        
    }
}