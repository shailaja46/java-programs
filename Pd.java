import java.util.*;
class Pd
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n Value:");
    int n=s.nextInt();
    int y,sum=0,r=0;
    y=n;
    while(n>0)
    {
     r=n%10;
     sum=sum*10+r;
     n=n/10;
     }
     if(sum==y)
     {
       System.out.println(sum+ "--> PALINDROME");
     }
     else
     {
      System.out.println(sum+ "-->  NOT PALINDROME");
     }
   }
}