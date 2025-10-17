package _01_Array;
//wap to input & display  elemrnt of 2d size 4,4

import java.util.Scanner;

public class Problem_26 {
	public static void inputArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print("Enter value of arr["+i+"]["+j+"] : ");
			arr[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}
		
		System.out.println(" \n");
	}
	
	public static void displayArr(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		displayArr(arr);
	}
}
