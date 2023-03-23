class rect{
    double length;
    double width;
    double area;

    public void areaofrectangle()
    {
        area=length*width;
        System.out.println("AREA OF RECTANGLE="+area);
    }
    public static void main(String[] args)
    {
     rect a1=new rect();
     a1.length=10.5;
     a1.width=18.9;
     a1.areaofrectangle();   
    }
}