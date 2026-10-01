class Methodoverloading1
{
public int add( int a, int b)
{
 return a+b;
}
public int add(int a,int b,int c)
{
return a+b+c;
}
public static void main(String args[])
{
Methodoverloading m=new Methodoverloading();
System.out.println(m.add(1,3));
System.out.println(m.add(1,8));
}
}
