package encapsulation;

public class student {
	private int roll_no;
	
	public void writeValue(int roll_no)// getter
	{
		if(roll_no<=0)
		{
			System.out.println("!Invalid Roll Number\nPlease enter a valid roll number:");
		}
		
		
		else {
		 this.roll_no = roll_no;
		}
		 
	}
	
	public int readValue()
	{
		
			return this.roll_no;	
		
		
	}

}
