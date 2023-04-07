import java.util.Scanner;

class Library
{
	
//	int n;
    String b_name;
    String a_name;
    
    Scanner sc = new Scanner(System.in);
    
    void showBooks()
    {
    	System.out.println("There are 10 books are available which are shown as below with their authors name.");
    	System.out.println("1.Adventures of Tom Sawyer: Mark Twain.\n2.Alice in Wonderland: Lewis Carrol.\n"
    			+ "3.Agni Veena: Kazi Nasrul Islam.\n4.Ancient Mariner: Coleridge.\n"
    			+ "5.Animal Farm: George Orwell.\n6.Arms and the Man: G.B.Shaw.\n"
    			+ "7.Ben Hur: Lewis Wallace.\n8.Around the World in eighty days: Jules Verne.\n"
    			+ "9.Baburnama: Babur.\n10.Anna Karenina: Leo Tolstoy.");
    	
    }
    
    void showMenu()
    {
    	System.out.println("There are some choices are available for you.");
    	System.out.println("1.Search a book by sNo.\n2.Search a book by author name.\n ");
//    	System.out.println("Enter Your choice.");
//    	n = sc.nextInt();
    }
    
//    void choice()
//    {
//    	System.out.println("Enter Your choice.");
//    	n = sc.nextInt();
//    }

}

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Library l1 = new Library();
		
		int n,sNo;
		String a_name = "";
		
		
		l1.showBooks();
		l1.showMenu();
		
		do
		{
		
		System.out.println("Enter Your choice.");
    	n = sc.nextInt();
    	
    	switch(n)
    	{
    	
    	case 1:
    		System.out.println("Enter the sNo of book.");
    		sNo = sc.nextInt();
    		switch(sNo)
    		{
    		case 1:
    			System.out.println("Adventures of Tom Sawyer: Mark Twain.");
    			break;
    		case 2:
    			System.out.println("Alice in Wonderland: Lewis Carrol.");
    			break;
    		case 3:
    			System.out.println("Agni Veena: Kazi Nasrul Islam.");
    			break;
    		case 4:
    			System.out.println("Ancient Mariner: Coleridge.");
    			break;
    		case 5:
    			System.out.println("Animal Farm: George Orwell.");
    			break;
    		case 6:
    			System.out.println("Arms and the Man: G.B.Shaw.");
    			break;
    		case 7:
    			System.out.println("Ben Hur: Lewis Wallace.");
    			break;
    		case 8:
    			System.out.println("Around the World in eighty days: Jules Verne.");
    			break;
    		case 9:
    			System.out.println("Baburnama: Babur.");
    			break;
    		case 10:
    			System.out.println("Anna Karenina: Leo Tolstoy.");
    			break;
    		default:
    			System.out.println("Invalid Choice");
    		
    		}
    	case 2:
    		System.out.println("Enter the author name plz type this name in all small letters with no space.");
    		a_name=sc.nextLine();
    		
    		switch(a_name)
    		{
    		case "marktwain":
    			System.out.println("Adventures of Tom Sawyer: Mark Twain.");
    			break;
    		case "lewiscarrol" :
    			System.out.println("Alice in Wonderland: Lewis Carrol.");
    			break;
    		case "kazinasrulislam" :
    			System.out.println("Agni Veena: Kazi Nasrul Islam.");
    			break;
    		case "coleridge" :
    			System.out.println("Ancient Mariner: Coleridge.");
    			break;
    		case "georgeorwell" :
    			System.out.println("Animal Farm: George Orwell.");
    			break;
    		case "gbshaw" :
    			System.out.println("Arms and the Man: G.B.Shaw.");
    			break;
    		case "lewiswallace" :
    			System.out.println("Ben Hur: Lewis Wallace.");
    			break;
    		case "julesverne" :
    			System.out.println("Around the World in eighty days: Jules Verne.");
    			break;
    		case "babur" :
    			System.out.println("Baburnama: Babur.");
    			break;
    		case "leotolstoy" :
    			System.out.println("Anna Karenina: Leo Tolstoy.");
    			break;
    		default:
    			System.out.println("Invalid Choice");
    		
    		}
    	case 3:
    		System.out.println("Exit");
    		break;
    	
    	}
    	}
    	while(n!=3);
    	

	}

}
