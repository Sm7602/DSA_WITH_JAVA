package _01_Array;

//WAp to display odd by2 and even by  mulpyin 2da size 4,4

import java.util.Scanner;

public class Problem_34 {
	
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
	
	public static void PositionArr(int arr[][])
	{
		System.out.println("position");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i % 2==0 && j % 2==0 )
				{
					System.out.print(arr[i][j]*2+"  ");
				}
				else
				{
					System.out.print(arr[i][j]*3+"  ");
				}
			}
			
			System.out.println("\n");
		}
	}
	
	public static void ValueArr(int arr[][])
	{
		System.out.println("value");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] % 2==0 )
				{
					System.out.print(arr[i][j]*2+"  ");
				}
				else
				{
					System.out.print(arr[i][j]*3+"  ");
				}
			}
		}
	}
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		PositionArr(arr);
		ValueArr(arr);
	}

}
