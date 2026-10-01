class A
{
void S()
{
System.out.println(" this is super class and method");
}
}
class B
{
void V()
{
System.out.println(" this is sub class and method");
}
}
class Methodoverridding
{
public static void main(String args[])
{
A a= new A();
a.S();
B b=new B();
b.V();
}
}


