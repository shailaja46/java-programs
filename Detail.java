import java.util.*;
class Detail
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number:");
    int firstnumber =s.nextInt();
    System.out.println("Enter second number:");
    int secondnumber=s.nextInt();
    System.out.println("Addition:" +(firstnumber+secondnumber));
    System.out.println("subtraction:" +(firstnumber-secondnumber));
    System.out.println("multiplication:" +(firstnumber*secondnumber));
    System.out.println("division:" +(firstnumber/secondnumber));
    if(firstnumber > secondnumber)
    {
      System.out.println(firstnumber+  "is bigger");
    }
    else
    {
      System.out.println(secondnumber+ "is bigger");
    }  
   }
}
