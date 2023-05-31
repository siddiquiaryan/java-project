package testing.constructur;

public class blc {
   int roll_no;
   String name;
   blc()// No parameterized constructor
   {
	   roll_no = 22710;
	   name = "Aryan";
   }
   blc(int roll_no, String name)
   {
	   this.roll_no = roll_no;
	   this.name = name;
   }
@Override
public String toString() {
	return "blc [roll_no=" + roll_no + ", name=" + name + "]";
}
   
   
}
