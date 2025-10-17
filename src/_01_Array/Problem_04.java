package _01_Array;

//WAP to display squre of all element sda size 8

import java.util.Scanner;

public class Problem_04 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("Value of arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("");
	}
	
	public static void displayArr(int arr[])
	{
		int sq;
		
		for(int i=0;i<arr.length;i++)
		{
		sq =arr[i]*arr[i];
		System.out.print(sq+"  ");
		}
	}
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}

}
