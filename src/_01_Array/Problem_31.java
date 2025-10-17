package _01_Array;
//WAP to display the odd position in 2d arr size 4,4

import java.util.Scanner;

public class Problem_31 {
	
	public static void inputArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print("value of arr["+i+"]["+j+"]  : ");
			arr[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public static void evenPositionArr(int arr[][])
	{
		System.out.println("odd position");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i % 2!=0 && j % 2!=0 )
				{
					System.out.print(arr[i][j]+"  ");
				}
				else
				{
					System.out.print("0  ");
				}
			}
			
			System.out.println("\n");
		}
	}
	
	public static void evenValueArr(int arr[][])
	{
		System.out.println("odd value");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] % 2!=0 )
				{
					System.out.print(arr[i][j]+"  ");
				}
			}
		}
	}

	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		evenPositionArr(arr);
		evenValueArr(arr);
	}
}