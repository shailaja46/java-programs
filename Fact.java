import java.util.*;
class Fact
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n Value:");
    int n=s.nextInt();
    int i,prod=1;
    for(i=1;i<=n;i++)
    {
      prod=prod*i;
    }
     System.out.println("factorial=" +prod);

 }
}
