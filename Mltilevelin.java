class A
{
int a;
}
class B extends A
{
int b;
}
class C extends B
{
int c;
public C()
{
a=2;
b=2;
c=2;
}
public void mul()
{
System.out.println("mul is:" +(a*b*c));
}
}
class Mltilevelin
{
public static void main(String args[])
{
C c=new C();
c.mul();
}
}
  