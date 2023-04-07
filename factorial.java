import java.util.Scanner;

public class factorial{
public static void main(String[] args) {
int fact=1;
int i=1;

Scanner sc=new Scanner(System.in);
System.out.println("enter a number who factorial to be found");
int num=sc.nextInt();
while(i<=num)
{
    fact=fact*i;
    i++;
}
System.out.println("factorial of " +num+ " is "+fact);


}
}