package _01_Array;

//WAP to find an elements size 8

import java.util.Scanner;

public class Problem_14 {
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
		int c=0;
		System.out.print("Elements [");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
			c++;
		}
		System.out.println("]");
		System.out.println("Total element is : "+c);
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
	}

}
