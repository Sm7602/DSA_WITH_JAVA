package _01_Array;

// WAP to replace even by 0 and ood by 1 element in sda size 5

import java.util.Scanner;

public class Problem_13 {
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Value of arr["+i+"]  : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n");
	}

	public static void displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2== 0)
			{
				System.out.println("Value of arr["+i+"]  : 0 ");
			}
			else
			{
				System.out.println("Value of arr["+i+"]  : 1 ");
			}
		}
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[5];
		inputArr(arr);
		displayArr(arr);
	}
}
