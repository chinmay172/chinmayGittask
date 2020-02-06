import java.io.*;
import java.util.*;
class Choco
{
	void chocolate(String a[],int b[])
	{
		int n=a.length,sum=0;
		System.out.println("\n Output of the Program:\n");
		System.out.println("The Chocolates Present are:");
		for(int h=0;h<n;h++)
		{
		   System.out.println("\t\t\t "+a[h]);
		}
		for(int h=0;h<n;h++)
		{
			sum=sum+b[h];
		}
		System.out.println("\n The Total Weight of the Chocolates is:"+sum);
		System.out.println("\nAfter Sorting The Chocolates are:");
		for(int e=0;e<n;e++)
		{
			for(int j=0;j<n-1;j++)
			{
				if((a[j].compareTo(a[j+1]))>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println("\t\t\t\t"+a[i]);
		}
	}
}
class EpamTask2
{
	public static void main(String arg[])
	{
		Choco o=new Choco();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of chocolates:");
		int l=sc.nextInt();
		String z[]=new String[l];
		int k[]=new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter name of the Chocolate:"+(i+1));
			z[i]=sc.next();
			System.out.println("Enter weight of the Chocolate Weight:"+(i+1));
			k[i]=sc.nextInt();
		}
	    o.chocolate(z,k);
	}
}