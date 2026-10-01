import java.util.*;
class Biggest
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number:");
    int firstnumber=s.nextInt();
    System.out.println("Enter second number:");
    int secondnumber=s.nextInt();
    System.out.println("Enter third number:");
    int thirdnumber=s.nextInt();
    if(firstnumber>secondnumber && firstnumber>thirdnumber)
    {
      System.out.println("Biggest number =" +firstnumber);
    }
    else if(secondnumber>thirdnumber)
    {
       System.out.println("Biggest number =" +secondnumber);
    }
    else
    {
      System.out.println("Biggest number =" +thirdnumber);
    }
   }
} 
