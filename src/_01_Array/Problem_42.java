package _01_Array;

import java.util.Scanner;

public class Problem_42 {
	public static void inputArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print("Value of arr["+i+"]["+j+"] : ");
			arr[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public static void  displayArr(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print(arr[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[2][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		inputArr(arr);
		displayArr(arr);
	}

}
