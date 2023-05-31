package emply.inheritance;

class static_polymorphism {
  void add(int a, int b)
  {
    System.out.println("SUM OF TWO NUMBERS="+(a+b));
  }  
}

class secondGen extends static_polymorphism {
    void add(int c)
    {
        System.out.println("SUM OF THREE NUMBERS="+(a+b+c));
    }
}
class Main{
    public  static void main(String args[])
    {
        static_polymorphism c1 = new static_polymorphism();
        c1.add(3,5);
        secondGen c2 = new secondGen();
        c2.add(8);
    }
}

