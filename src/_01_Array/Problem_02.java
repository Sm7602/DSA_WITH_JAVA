package _01_Array;

//WAP to add all elements of SDA size 8

import java.util.Scanner;

public class Problem_02 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i< arr.length;i++)
		{
			System.out.print("Value of arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println(" \n");
	}
	
	public static void sumArr(int arr[])
	{
		int s=0;
		
		for(int i=0;i<arr.length;i++)
		{
			s +=arr[i];
		}
		System.out.println("sum of arr "+s);
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		sumArr(arr);
	}

}
