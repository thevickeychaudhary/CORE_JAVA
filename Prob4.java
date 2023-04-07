import java.util.Scanner;

class A
{
//	int  x = random1();
   int random1()
   {
	   int min = 400;
	   int max = 600;
		
		//System.out.println("Random value of int between "+min+" to "+max+" :");
		int c = (int) (Math.random()*(max-min+1)+min);
//		System.out.println(c);
		return c;
   }
}

class B extends A
{
//	int y = random2();
	
  int random2()
{
 
	int min = 400;
	 int max = 600;
		
		//System.out.println("Random value of int between "+min+" to "+max+" :");
		int d = (int) (Math.random()*(max-min+1)+min);
//		System.out.println(d);
		return d;
	
}
}
public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b1 = new B();
//        b1.random2();
//        b1.random1();
		
		System.out.println(b1.random2()+" "+b1.random1());
        
		
//		System.out.println(c);

	}

}
