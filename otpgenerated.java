import java.util.Scanner;
public class otpgenerated
{
   public static void main (String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();400
      int c=sc.nextInt();200
      int d=(int)Math.random()*(n-c+1)+c;
      System.out.println("OTP IS GENERATED "+d);
   }

}