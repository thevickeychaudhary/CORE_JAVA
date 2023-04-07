
import java.util.Scanner;
public class Student1{
int rollno;  //instant variable 
String name;// instant variable

void insertRecord(int r, String n){
rollno=r;
name=n;
}
void displayinformation()
{
    System.out.println(rollno+"   "+name);
}



    public static void main(String[]args){
        Student1 s1=new Student1();
        Student1 s2=new Student1();
        s1.insertRecord(111,"karan");
        s2.insertRecord(222,"aryan");
        s1.displayinformation();
        s2.displayinformation(); 




}
}