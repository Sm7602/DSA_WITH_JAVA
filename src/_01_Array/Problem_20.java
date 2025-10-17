package _01_Array;
//WAP to reverse an Sda size 8

import java.util.Scanner;

public class Problem_20 {
	
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
			
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
	}
	
	public static void reverceArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int rev=0;
			int rem;
		    while(arr[i]>0)
		      {
			     rem=arr[i]%10;
			     rev=(rev*10)+rem;
			     arr[i]=arr[i]/10;
		      }
		System.out.print(rev+"  ");
	    }
	}
	

	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
		reverceArr(arr);
	}
}
