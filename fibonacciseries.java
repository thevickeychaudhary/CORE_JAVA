public class fibonacciseries{
public static void main(String[]args)
{

   int  n1=0,n2=1,i,n3,count=10;
    System.out.print(n1+" "+n2);

   for(i=2;i<count;i++)   // position of a number 
   {
      
    n3=n1+n2;
        System.out.print(" "+n3);
 n1=n2;
n2=n3;

   }
}


}