import java.util.*;
class Prime
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n Value:");
    int n=s.nextInt();
    int i,count=0;
    for(i=1;i<=n;i++)
    {
      if(n%i==0)
      count++;
    }
     if(count==2)
     {
     System.out.println(n+ " is a prime number");
     }
     else
     {
       System.out.println(n+ " is  not a prime number");
     }
 }
}
