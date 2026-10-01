import java.util.*;
class Arm
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter n value:");
int n=s.nextInt();
int temp =n;
int r=0,cube=0,sum=0;
while(n>0)
{
r=n%10;
cube=r*r*r;
sum=sum+cube;
n=n/10;
}
if(temp==sum)
{
System.out.println( temp+   "is a armstrong number");
}
else
{
System.out.println( temp+  "is not a armstrong number");
}
}
}


