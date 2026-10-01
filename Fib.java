import java.util.*;
class Fib
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value:");
int n=s.nextInt();
int i,a=0,b=1,c;
for(i=1;i<=n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}