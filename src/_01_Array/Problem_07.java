package _01_Array;
//WAP to replace all element by their aqure in sda size 8

import java.util.Scanner;

public class Problem_07 {
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
	
	public static void repalceArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		int sq =arr[i]*arr[i];
		System.out.println("Value of arr["+i+"] : "+sq);
		}
		System.out.println("\n");
	}

	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		repalceArr(arr);
	}

}
