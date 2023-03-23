// area of circle usig instance variable
class areaOfCircle{
    double radius;
    double area;
    double pi=3.14;

public void areaCalculator()
{
   area=3.14*radius*radius;
   System.out.println("AREA OF CIRCLE="+area);
}
public static void main(String[] arg)
{
   areaOfCircle a1= new areaOfCircle();
   a1.radius=3.5;
   a1.areaCalculator();
}
}