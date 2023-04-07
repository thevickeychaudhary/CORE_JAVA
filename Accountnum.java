import java.util.Scanner;
public class Accountnum{
int accno;
String name;
float amount;

// method to intialize object
void insert(int a, String n, float amt);
{
    accno=a;
    name=n;
    amount=amt;
}
// deposit method 
void deposit(float amt){
    amount=amount+amt;
    System.out.println(amt+ "deposited");
}
// withdraw method
void withdraw(float amt)
{
    if(amount<amt){
        System.out.println("insufficient balance");
    }
    else{
        amount=amount-amt;
        System.out.println(amt+ "withdrawn");
    }
}

// Method to check the balance of account
void checkBalance(){
    System.out.println("balance is :" +amount);
}
// method to display the value of the object
void display(){
    System.out.println(accno+ " "+name+" "+amount);
}

// creating a test class to deposit and withdraw amount
 // class TestAccount{
    public static void main(String args[]){
        Accountnum a1=new Accountnum();
        Scanner sc=new Scanner(System.in);
        
       // System.out.println(" ")

        System.out.println(" Enter your choice");
        int n=sc.nextInt();
        switch(n){
            case 1:{
        a1.insert(668900,"vicky",20000);}
        case 2:{
        a1.display();}
        case 3:{
        a1.checkBalance();}
        case 4:{
        a1.deposit(5000);}
        case 5:{
        a1.checkBalance();}
        case 6:{
        a1.withdraw(10000);}
        case 7:{
       a1.checkBalance();}   
}
    }
  }