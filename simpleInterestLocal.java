public class simpleInterestLocal { // program to claculate simple interest
    public static void main(String args[])
    {
        double princinple=25000;
        double  roi=11.55;  // rate of interest
        int time=1;     //time in years
        double si=(princinple*roi*time)/100;
        System.out.println("Simple Interest="+si);
    }
    
}
