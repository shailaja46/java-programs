import java.util.*;
class larsmal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:\n");
		int n=s.nextInt();
		System.out.println("Enter array elements:\n");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the array elements are:\n");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"  ");
		}
  		int largest=a[0];
		int smallest=a[0];
		for(int num:a)
		{
			if(num>largest)
			{
				largest=num;
			}
			if(num<smallest)
			{
				smallest=num;
			}
		}
		System.out.println("largest number is:" +largest");
		System.out.println("the array elements are:" +smallest");
	}
}