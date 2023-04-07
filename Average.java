import java.util.Scanner;
public class Average{
    int length,bridth,hight;
    int average;
    void insert(int a,int b, int c){
        length=a;
        bridth=b;
        hight=c;
    }
    void calculate(){
    average=(length+bridth+hight)/3;
        System.out.println("average of three numbers is :" +average);
        }
     // void display(){
     //   System.out.println(length+ " "+bridth+ " "+hight);
    //    }

   public static void main(String args[]){
    Average a1=new Average();
    Scanner sc=new Scanner(System.in);
    System.out.println(" the value of a is :");
    int a =sc.nextInt();
     System.out.println(" the value of b is :");
    int b =sc.nextInt();
     System.out.println(" the value of c is :");
    int c =sc.nextInt();
    a1.insert(a,b,c);
    //a1.display();
    a1.calculate();
   }
}