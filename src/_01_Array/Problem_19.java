package _01_Array;

//WAP to reverse an Sda size 8

import java.util.Scanner;

public class Problem_19 {
	
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
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("Value of arr["+i+"] :"+arr[i]);
		}
		
	}

	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}
}
