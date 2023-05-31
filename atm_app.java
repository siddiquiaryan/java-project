package atm;
import java.util.*;


public class atm_app {

	public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner(System.in);
		 
		atm_backend c1 = new atm_backend();
		
		int n=1;
		
		 while(n==1)
		 {
		  System.out.println("1: Enter customer Detail");
		  System.out.println("2: Deposite Amount");
		  System.out.println("3: Withdraw Amount");
		  System.out.println("4: View Balance");
		  System.out.println("5: View Account Detail");
		  System.out.println("6: Exit");
		  System.out.println("7: UPDATE TRANSACTION PIN :\n");
		  System.out.println("   ENTER OPERATION NUMBER :");
		  int ch = sc.nextInt();
		  
		switch(ch)
		{
		
		case 1: 
			  
		        System.out.println("Enter Account No :");
		        int acc = sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter Customer Name :");
		        String cst = sc.nextLine();
		        c1.custData(cst,acc);
		        
		        break;
		
		case 2: System.out.println("Enter amount to Deposite:");
		        int b = sc.nextInt();
		        c1.deposite(b);
		        
		        break;
		        
		        
		        
		case 3: 
		        
		       
			    c1.withdraw();
		
		        break;
		
		case 4:  System.out.println("BALANCE="+c1.viewBalance());
		        break;
		
		case 5: c1.accDetail();
		        break;
		
		case 6: System.exit(0);
		break;
		
		case 7: c1.updatePin();
		break;
		
		default: System.out.println("Enter valid operation:");
		        
		}
		 }

	}

}
