import java.util.Scanner;

 class area{
  private int length;
  private int width;

  public int getlength()
  {
 //  Scanner sc=new Scanner(System.in);
 //      System.out.println("length is :");
//         int length=sc.nextInt();
    return length;
  }
  public int getwidth(){
  //  Scanner sc=new Scanner(System.in);
 //     System.out.println("width is :"); 
//       int width=sc.nextInt();
    return width;
  }
  public void setLength(int length){
    this.length=length;
}
public void setWidth(int width){
    this.width=width;
}
}
public class Tut29
{
    public static void main (String args[]){
        area ar=new area();
       ar.setLength(5);
       ar.setWidth(7);
  
        System.out.println("area of rectangle is :"  +(ar.getlength()*ar.getwidth()));
        
    }
}