package BankDetail;
import java.util.Scanner;

public class BankDetails {
	String accno;  
    String name;  
      
    long balance;  
   Scanner sc = new Scanner(System.in);
   
	public static void main(String[] args) {}
		// TODO Auto-generated method stub
			
		 
		//method to deposit money  
		    public void deposit() {  
		        long amt;  
		        System.out.println("Enter the amount you want to deposit: ");  
		        amt = sc.nextLong();  
		        balance = balance + amt;  
		    }  
		    //method to withdraw money  
		    public void withdrawal() {  
		        long amt;  
		        System.out.println("Enter the amount you want to withdraw: ");  
		        amt = sc.nextLong();  
		        if (balance >= amt) {  
		            balance = balance - amt;  
		            System.out.println("Balance after withdrawal: " + balance);  
		        } else {  
		            System.out.println("Your balance is less than " + amt + "Transaction failed" );  
		        }  
		    }


}