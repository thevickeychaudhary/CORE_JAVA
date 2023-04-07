import java.util.Scanner;
//import java.util.Timer;
class Account
{
   private long acc_no;  // acc_no,acc_name,acc_type,acc_balance
   private String acc_name;
   private String acc_type;
   private long acc_balance;
   
     Scanner sc = new Scanner(System.in);
   
   // Method to open new account
   void openAcc()
   {
	   System.out.println("Enter acc number");
	   acc_no = sc.nextLong();
	   
	   System.out.println("Enter acc holder name");
	   acc_name = sc.next();
	   
	   System.out.println("Enter acc type");
	   acc_type = sc.next();
	   
	   System.out.println("Enter acc balance");
	   acc_balance = sc.nextLong();
   }
   
   //to display account details
   void showDetails()
   {
	   
	   System.out.println("Your Account Number is :"+acc_no);
	   System.out.println("Account Holder's Name is :"+acc_name);
	   System.out.println("Your Account Type is :"+acc_type);
	   System.out.println("You Account Balance is :"+acc_balance);
	   
   }
   
   //to deposit money
   void deposit()
   {
	   
	   long amt;
	   System.out.println("Enter the amount to be deposit");
	   amt = sc.nextLong();
	   acc_balance += amt;
   }
   
   //to withdraw money
   void withdraw()
   {
	   
	   long amt;
	   System.out.println("Enter the amount to be withdraw");
	   amt = sc.nextLong();
	   if(acc_balance>=amt)
	   {
		   acc_balance -= amt;
		   System.out.println("Balance after withdrawl :"+acc_balance);
	   }
	   else
		   System.out.println("Your balance is less than "+amt+"\tTransaction failed");
	   
   }
   
   //method to search an account number
   boolean search(long ac_no)
   {
	 
	  
	   if(acc_no==ac_no)
	   {
		   showDetails();
		   return(true);
	   }
	   return (false);
   }
   
   
}


public class Tut1907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//create account
		Account a1 = new Account();
    	Account a2 = new Account();
		System.out.println("Enter person1 account details");
		a1.openAcc();
		System.out.println("Enter person2 account details");
		a2.openAcc();
		
		int ch;
		do {
		
		System.out.println("*Banking System Application*");  
        System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        
        switch(ch)
        {
        case 1:
        	a1.showDetails();
    		a2.showDetails();
    		break;
        case 2:
        	System.out.println("Enter account number you want to search");
        	long ac_no = sc.nextLong();
        	
        	boolean found1 = false; 
        	found1 = a1.search(ac_no);
        	if(found1)
        	{
        		System.out.println("Account exist");
        		a1.showDetails();
        	}
        	else if(!found1)
        	{
        		System.out.println("Account doesn't exist:");
        		//a1.showDetails();
        	}
        	
        	boolean found2= false;
        	found2 = a2.search(ac_no);
        	if(found2)
        	{
        		System.out.println("Account exist");
        		a2.showDetails();
        	}
        	else if(!found2)
        	{
        		System.out.println("Account  doesn't exist:");
        		//a2.showDetails();
        	}
        	
        	break;
        case 3:
        	System.out.println("Enter account number");
        	ac_no = sc.nextLong();
        	
        	found1 = false;
        	found1 = a1.search(ac_no);
        	if(found1)
        	{
        		System.out.println("Account exist");
        		a1.deposit();
        	}
        	else if(!found1)
        	{
        		System.out.println("Account doesn't exist:");
        		//a1.showDetails();
        	}
        	
        	found2= false;
        	found2 = a2.search(ac_no);
        	if(found2)
        	{
        		System.out.println("Account exist");
        		a2.deposit();
        	}
        	else if(!found2)
        	{
        		System.out.println("Account  doesn't exist:");
        		//a2.showDetails();
       	    }
        	break;
        	
        	
        case 4:
        	System.out.println("Enter account number");
        	ac_no = sc.nextLong();
        	
        	found1 = false;
        	found1 = a1.search(ac_no);
        	if(found1)
        	{
        		System.out.println("Account exist");
        		a1.withdraw();
        	}
        	else if(!found1)
        	{
        		System.out.println("Account doesn't exist:");
        		//a1.showDetails();
        	}
        	
        	found2= false;
        	found2 = a2.search(ac_no);
        	if(found2)
        	{
        		System.out.println("Account exist");
        		a2.withdraw();
        	}
        	else if(!found2)
        	{
        		System.out.println("Account  doesn't exist:");
        		//a2.showDetails();
        	}
        	break;
        	
        case 5:
        	 System.out.println("Thank You for using our Bank Services...");
        	 break;
        	 
//        default:
//        	 System.out.println("Invalid Choice"); 
        	
        	}
		}
        while (ch != 5); 
        	
        }
       
        
	}