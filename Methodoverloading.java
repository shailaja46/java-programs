class Methodoverloading
{
public int add(int a, int b)
{
return a+b;
}
public int add(int a, int b, int c)
{
return a+b+c;
}
public static void main(String args[])
{
Methodoverloading m= new Methodoverloading();
System.out.println(m.add(10,30));
System.out.println(m.add(2,2,2));
}
}
