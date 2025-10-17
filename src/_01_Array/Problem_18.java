package _01_Array;


//WAP to add all prime no  in sda elements sda size 8

import java.util.Scanner;

public class Problem_18 {
	
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
		int c=0;
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]% j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.print(arr[i]+"  ");
				s+=arr[i];
			}
		}
		System.out.println("sum :"+s);
		
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}

}