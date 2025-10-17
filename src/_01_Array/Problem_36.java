package _01_Array;
//WAp to add all odd  and even    2da size 4,4

import java.util.Scanner;

public class Problem_36 {
	
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
		System.out.println("position");
		int es=0;
		int os=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i % 2==0 && j % 2==0 )
				{
					es +=arr[i][j];
				}
				else
				{
					os +=arr[i][j];
				}
			}
		}
		System.out.println("sum of even position: "+es);
		System.out.println("sum of odd position : "+os);
		
		System.out.println("\n");
	}
	
	public static void evenValueArr(int arr[][])
	{
		System.out.println("value");
		int es=0;
		int os=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] % 2==0 )
				{
					es +=arr[i][j];
				}
				else
				{
					os +=arr[i][j];
				}
			}
		}
		System.out.println("sum of even value: "+es);
		System.out.println("sum of odd value : "+os);
	}
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		evenPositionArr(arr);
		evenValueArr(arr);
	}
	}
