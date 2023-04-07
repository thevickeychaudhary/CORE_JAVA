import java.util.Scanner;

public class Area{
    int length;
    int  bridth;
    int rectangle;
    void insert(int l,int b){
        length=l;
        bridth=b;
    }
    void calculation(){
        rectangle=length*bridth;
        System.out.println("area of a rectangle is :" +rectangle);
      
}
void display(){
  System.out.println(length+ " " +bridth);

}
public static void main(String args[])
{
    Area a1=new Area();
    a1.insert(8,9);
   a1.display();
    a1.calculation();
   
}
}
