import java.util.*;
class Sum
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n =s.nextInt();
    int i,sum=0;
    for(i=1;i<=n;i++)
    {
      sum=sum+i;
    }
     System.out.println("sum =" +sum);

   }
} 
