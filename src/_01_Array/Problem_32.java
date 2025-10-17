package _01_Array;
//WAP to replase the even position by squre in 2d arr size 4,4

import java.util.Scanner;

public class Problem_32 {
	
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
		System.out.println("even position");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i % 2==0 && j % 2==0 )
				{
					int s=arr[i][j];
						s=arr[i][j]*arr[i][j];	
					System.out.print(s+"  ");
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
		System.out.println("even value");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] % 2==0 )
				{
					int s=arr[i][j];
					s=arr[i][j]*arr[i][j];
					System.out.print(s+"  ");
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
