import java.util.Scanner;
class voter{
    private int age ;
    public int getAge(){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter your age :");
        int age=sc.nextInt();
        return age;
    }
    if (age>18){
 public void setAge(int age){
        this.age=age;
    }
}
}

public class Tut29age{
    public static void main(String args[])
    {
        voter vr=new voter();
     //   Scanner sc=new Scanner();
       // int age=sc.nextInt();
       // vr.setAge(20);
        System.out.println(" you can voye" +(vr.getAge));
    }

}
