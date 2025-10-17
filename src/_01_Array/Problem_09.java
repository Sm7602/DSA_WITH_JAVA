package _01_Array;

//Wap to replace all odd element by qube size 8

import java.util.Scanner;

public class Problem_09 {
	
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
			if(i % 2!=0)
			{
				int Qu=arr[i]*arr[i]*arr[i];
				System.out.println("Value of arr["+i+"] : "+Qu);
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
