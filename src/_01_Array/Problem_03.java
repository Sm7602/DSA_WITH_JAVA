package _01_Array;

//WAP to multiply all elements of sda size 12

import java.util.Scanner;

public class Problem_03 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i< arr.length;i++)
		{
			System.out.print("Value of arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println(" \n ");
	}
	
	public static void mulOfArr(int arr[])
	{
	    int m=1;
		for(int i=0;i< arr.length;i++)
		{
			m *=arr[i];
		}
		System.out.println("multiply all elements of sda : "+m);
	}
	public static void main(String [] arg)
	{
		int arr[]=new int[12];
        inputArr(arr);
        mulOfArr(arr);
	}
}
