class Super
{
   int a;
}
class Sub extends Super
{
   int b;
   public Sub()
   {
      a=10;
      b=5;
   }
   public void mul()
   {
     System.out.println("the mul is:" +(a*b));
   }
}
class Singlein
{
  public static void main(String args[])
  {
     Sub s= new Sub();
     s.mul();
  }
}
