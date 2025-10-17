package _01_Array;

// sorting arr

import java.util.Scanner;

public class Problem_22 {
	
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
	
	public static void be_sor_displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
	}
	
	public static void sortingArr(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				int temp=0;
				 if(arr[j]>arr[j+1])
			       {
			    	temp=arr[j];
			    	arr[j]=arr[j+1];
			    	arr[j+1]=temp;
			       }
			}
	   }
	}
	
	public static void af_sor_displayArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] arg)
	{
		int arr[]=new int[5];
		inputArr(arr);
		be_sor_displayArr(arr);
		sortingArr(arr);
		af_sor_displayArr(arr);
	}

}
