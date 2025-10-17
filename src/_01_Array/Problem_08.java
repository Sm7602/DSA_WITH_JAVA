package _01_Array;

import java.util.Scanner;

//Wap to replace all even element by their squre in sda size 8

public class Problem_08 {
	
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
	
	public static void displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i % 2==0)
			{
				int sq=arr[i]*arr[i];
				System.out.println("Value of arr["+i+"] : "+sq);
			}
		}
	}
        public static void main(String[] arg)
        {
	     int arr[]=new int[8];
	     inputArr(arr);
	     displayArr(arr);
        }
}
