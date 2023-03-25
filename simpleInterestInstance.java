class simpleInterestInstance {
    double p_amount; //  instance variable
    double roi;  //  instance variable
    double sim_int;
    int time;  //  instance variable

    public void show()// Function to show output
    {
        System.out.println("PRINCIPLE AMOUNT="+p_amount);
        System.out.println("RATE OF INTEREST="+roi);
        System.out.println("SIMPLE INTEREST="+sim_int);
    }
    public void intcalculator()// funtion to calculate the interest
    {
       p_amount=25000;
       roi=11.55;
       time=1; //time in years
       sim_int= (p_amount*roi*time)/100.0;
    }
    
  public static void main(String args[])
  {
    simpleInterestInstance s1= new simpleInterestInstance(); s1.show();
    
    s1.intcalculator();s1.show();
  }

    
}
