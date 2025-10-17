package _01_Array;

//Wap to change the serch element

import java.util.Scanner;

public class Problem_21 {
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
	
	public static void serchArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.print("search arr : ");
		i=sc.nextInt();
		System.out.println("arr["+i+"]  is : "+arr[i]);
		
		System.out.println("\n");
	}
	
	public static void serchpositionArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("search  position of : ");
		n=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				System.out.print("position is : "+"arr["+i+"]");
			}
		}
		 
	}
	public static void main(String[] arg)
	{
		int arr[]=new int[5];
		inputArr(arr);
		serchArr(arr);
		serchpositionArr(arr);
		
	
		
	}

}
