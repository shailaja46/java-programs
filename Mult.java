import java.util.*;
class Mult
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n =s.nextInt();
    int i;
    for(i=1;i<=10;i++)
    {
       System.out.println(n + "*" +i+ " = " +n*i);
    }
 }
}
