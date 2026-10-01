import java.util.*;
class Rno
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n Value:");
    int n=s.nextInt();
    int sum=0,r=0;
    while(n>0)
    {
     r=n%10;
     sum=sum*10+r;
     n=n/10;
     }
      System.out.println("Reverse=" +sum);

 }
}