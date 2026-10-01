class A
{ 
int a;
}
class B extends A
{
int b;
public B()
{
a=10;
b=2;
}
public void add()
{
System.out.println("add is:"+(a+b));
}
}
class C extends A
{
int c;
public C()
{
a=4;
c=9;
}
public void mul()
{
System.out.println("mul is:"+(c*a));
}
}
class Hin
{
public static void main(String args[])
{
B b=new B();
b.add();
C c=new C();
c.mul();
}
}

