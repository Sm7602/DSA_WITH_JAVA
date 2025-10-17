package _01_Array;

//wap to input & display  elemrnt of SDA size 15

import java.util.Scanner;

public class Problem_01 {
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter value of arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" \n");
	}
	
	public static void displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	
	
	public static void main(String[] arg)
	{
		int arr[]=new int[15];
		inputArr(arr);
		displayArr(arr);
	}

}
