package _01_Array;

import java.util.Scanner;

//deletion of arrary

public class Problem_25 {
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
	
	public static void be_de_displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void deleteArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("index : ");
		int index=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i< index)
			{
				arr[i]=arr[i];
			}
			else if(i== index)
			{
				continue;
			}
			else
			{
				arr[i-1]=arr[i];
			}
		}
	}
	
	public static void af_de_displayArr(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] arg)
	{
		int arr[]=new int[5];
		inputArr(arr);
		be_de_displayArr(arr);
		deleteArr(arr);
		af_de_displayArr(arr);
		
	}
}
