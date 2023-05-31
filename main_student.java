package encapsulation;

public class main_student {

	public static void main(String[] args) {
		
		student s1 = new student();
		
		s1.writeValue(22710);// initializing roll no in instance variable
		
		System.out.println(s1.readValue()); // printing value of roll no
	}

}
