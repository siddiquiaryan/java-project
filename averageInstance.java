public class averageInstance { //average of numbers using instance variable
    double num1;
    double num2;
    double num3;
    double avg;

    public void averageCalculator()
    {
        avg=(num1+num2+num3)/3;
        System.out.println("Average="+avg);
    }
    public static void main(String args[])
    {
        averageInstance avg1= new averageInstance();
        avg1.num1=37;
        avg1.num2=67;
        avg1.num3=87;
        avg1.averageCalculator();
    }
   
}
