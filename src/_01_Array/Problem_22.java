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
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
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
