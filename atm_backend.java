package atm;
import java.util.*;

public class atm_backend {
  private  int balance;
  private String cust_name;
  private int acc_no;
  private int pin=1234;
  
  Scanner scan = new Scanner(System.in);
  
    public void updatePin()
    {
    	
    	System.out.println("Enter Current Pin:");
    	int tpin = scan.nextInt();
    	
    	
    	if(this.pin==tpin)
    	{
    	System.out.println("Update your transaction Pin:");
    	int pin = scan.nextInt();
    	this.pin = pin;
    	
    	}
    	else
    	{
          System.out.println("Please enter correct pin\n\n");
    	}
    }
    
 
    
    public void custData(String cust_name,int acc_no)// initialize account details
    {
    	
    	this.cust_name = cust_name;
    	this.acc_no = acc_no;
    }
    
    public void deposite(int balance)// deposite balance
    {
    	if(balance<=0)
    	{
    		System.out.println("Invalid Deposite");
    	}
    	
    	else 
    	{
    	 this.balance = this.balance + balance;
    	}
    }
    
    public void withdraw() // withdraw balance
    {
    	System.out.println("Enter 4 digit pin:");
        int pin = scan.nextInt();
       
    	
    	
        if(this.pin==pin)
    	{
    	
    	 System.out.println("Enter Amount to withdraw:");
         int w_amt = scan.nextInt();
         if(w_amt<=this.balance)
         this.balance = this.balance - w_amt;
         else
        	 System.out.println("Insufficient Balance\n\n");
    	}
    	else
    	{
    		System.out.println("Entered wrong pin !\n\n\n");
    	}
    		
    }
    
    public int viewBalance()// view balance
    {
    	return this.balance;
    }
    
    public void accDetail()
    {
    	System.out.println("CUSTOMER NAME : "+cust_name);
    	System.out.println("ACCOUNT NO : "+acc_no);
    	System.out.println("BALANCE: "+this.balance);
    	
    }
  
    
    
}
