import java.util.Scanner;


public class primenumber{
    public static void main(String[]args){

     
     Scanner sc= new Scanner(System.in);  
       System.out.println("Enter a number : ");  
       int n= sc.nextInt();

       int i,m,flag=1;
       m=n/2;
        if(n==0||n==1)
       {
        System.out.println(n+ "not a prime number");
       }
       else {
        for(i=2;i<m;i++){
        if(n%2==0)
        {
          System.out.print(n+ " not a prime number");
          flag=0;
          break;
        }
        }
        if(flag==1){
          System.out.print(n+"  is prime number");
        }
       }
   
    }
    
    }

   
   