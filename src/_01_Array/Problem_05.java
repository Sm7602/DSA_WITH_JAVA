package _01_Array;

//WAP to display all element even position in sda size 8

import java.util.Scanner;

public class Problem_05 {
	
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
	
	public static void displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i % 2==0)
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
