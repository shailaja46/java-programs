import java.util.*;
class Twodarray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter r value:\n");
		int r=s.nextInt();
		System.out.println("enter cvalue:\n");
		int c=s.nextInt();
		System.out.println("enter array elements:\n");
		int a[][]=new int[r][c];
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the array elements are:\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println(" ");
		}
	}
}
