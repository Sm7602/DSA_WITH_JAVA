package _01_Array;


//WAP to count prime no in sda elements sda size 8

import java.util.Scanner;

public class Problem_16 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Value of arr["+i+"] :");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n");
	}
	
	public static void displayArr(int arr[])
	{
		
		int pc=0;
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]% j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				pc++;
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println("Total prime :"+pc);
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}

}
