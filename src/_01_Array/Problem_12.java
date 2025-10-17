package _01_Array;

//WApP to add all even and odd elemrnts of Sda size 8

import java.util.Scanner;

public class Problem_12 {
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

	public static void evenArr(int arr[])
	{
		int s=0;
		
		System.out.print("Even element[ ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+"  ");
				s += arr[i];
			}
		}
		System.out.println("]");
		System.out.println("sum of even elements : "+s+"\n");
	}
	
	public static void oddArr(int arr[])
	{
		int s=0;
		
		System.out.print("odd element[ ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				System.out.print(arr[i]+"  ");
				s += arr[i];
			}
		}
		System.out.println("]");
		System.out.println("sum of odd elements : "+s);
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		evenArr(arr);
		oddArr(arr);
	}
}
