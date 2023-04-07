import java.util.Scanner;
//import java.util.Timer;
class Bank
{
   private long acc_no;  // acc_no,acc_name,acc_type,acc_balance
   private String acc_name;
   private String acc_type;
   private long acc_balance = 0;
   
     Scanner sc = new Scanner(System.in);
   
   // Method to open new account
   void openAcc()
   {
	   System.out.println("Enter acc number");
	   acc_no = sc.nextLong();
	   
	   System.out.println("Enter acc holder name");
	   acc_name = sc.nextLine();
	   
	   System.out.println("Enter acc type");
	   acc_type = sc.nextLine();
	   
//	   System.out.println("Enter acc balance");
//	   acc_balance = sc.nextLong();
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
	   this.acc_balance += amt;
	   System.out.println("Your updated balancce is :"+acc_balance);
   }
   
   //to withdraw money
   void withdraw()
   {
	   
	   long amt;
	   System.out.println("Enter the amount to be withdraw");
	   amt = sc.nextLong();
	   if(acc_balance>=amt)
	   {
		   this.acc_balance -= amt;
		   System.out.println("Your updated balance is :"+acc_balance);
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
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of account which you want to create");
		n = sc.nextInt();
		
		Account a5 = new Account();
//		int a[] = new int[n];
//		for(int i=0; i<a.length; i++)
//		{
//			a5.openAcc();
//		}
		
		//create account
		Account a1 = new Account();
//    	Account a2 = new Account();
    	int a[] = new int[n];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter person"+i+" account details");
			a1.openAcc();
		}
//		System.out.println("Enter person1 account details");
//		a1.openAcc();
//		System.out.println("Enter person2 account details");
//		a2.openAcc();
		
		int ch;
		do {
		
		System.out.println("Banking System Application");  
        System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        
        switch(ch)
        {
        case 1:
//        	a1.showDetails();
//    		a2.showDetails();
        	for(int i=0; i<a.length; i++)
    		{
    			System.out.println("Person"+i+" account details are :");
    			a1.showDetails();
    		}
    		break;
        case 2:
        	System.out.println("Enter account number you want to search");
        	long ac_no = sc.nextLong();
        	
        	boolean found1 = false; 
        	found1 = a1.search(ac_no);
        	for(int i=0; i<a.length; i++)
        	{
        		boolean found = false;
        		found = a1.search(ac_no);
        		if(found)
            	{
            		System.out.println("Account exist");
            		a1.showDetails();
            	}
            	else if(!found)
            	{
            		System.out.println("Account doesn't exist:");
            		//a1.showDetails();
            	}
        		
        	}
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