package _01_Array;

import java.util.Scanner;

//deletion of arrary 2d

public class Problem_40 {
	public static void inputArr(int arr[][])
	{
       Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print("Value of arr["+i+"]["+j+"] : ");
			arr[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public static void be_de_displayArr(int arr[][])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void deleteArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("index : ");
		int in=sc.nextInt();
		
		for(int i=0;i<arr.length-i;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
			if(arr[i][j]> in)
			{
				arr[i][j]=arr[i][j];
			}
			else if(arr[i][j]==in)
			{
				continue;
			}
			else
			{
				arr[i-1][j-1]=arr[i][j];
			}
			}
		}
	}
	
	public static void af_de_displayArr(int arr[][])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}
	

	public static void main(String[] arg)
	{
		int arr[][]=new int[2][2];
		inputArr(arr);
		be_de_displayArr(arr);
		deleteArr(arr);
		af_de_displayArr(arr);
		
	}
}
