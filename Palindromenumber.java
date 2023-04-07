
import java.util.Scanner;

public class Palindromenumber{

public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);  
System.out.println("enter n number");
int n=sc.nextInt();
int reverse=0,x,temp;

x=n;
while(n>0){
temp=n%10;
reverse=(reverse*10)+temp;
n=n/10;
}
if(x==reverse)
{
    System.out.println("palindrome number");
}
else{

    System.out.println("not a palindrome number");
}


}

}