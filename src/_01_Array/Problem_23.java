package _01_Array;

// WAP to searching element

import java.util.Scanner;

public class Problem_23 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Value of arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n");
	}
	
	public static void searchArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		int j=0;
		System.out.print("search arr : ");
		j=sc.nextInt();

		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(j==i)
			{
				 c++;
			}
		}
		if(c==1)
		{
			System.out.print("Found ! ");
		}
		else
		{
			System.out.print("Not Found ! ");
		}
		System.out.println("\n");
	}
	
	public static void serchpositionArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("search  position of : ");
		n=sc.nextInt();
		
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				c++;
			}
		}
		if(c==1)
		{
		System.out.print("Found ! ");
		}
		else
		{
		System.out.print("Not Found ! ");
		}
		 
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[5];
		inputArr(arr);
		searchArr(arr);
		serchpositionArr(arr);
	}

}
