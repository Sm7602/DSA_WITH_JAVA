package _01_Array;

//WAP to find prime no in sda elements sda size 8

import java.util.Scanner;

public class Problem_15 {
	
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
		
		for(int i=0;i<arr.length;i++)
		{
			int c=0;

			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]% j ==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.print(arr[i] +"  ");
			}
		}
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}

}
