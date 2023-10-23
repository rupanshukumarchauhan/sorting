package assignment_3;
import java.util.Scanner;
public class q3 
{
	//using selection sort
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("how many numbers ?");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter numbers ");
		for (int i =0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
			int key =i;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[key])
				{
					key =j;
				}
			}
			int temp=a[i];
			a[i]=a[key];
			a[key]=temp;
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
