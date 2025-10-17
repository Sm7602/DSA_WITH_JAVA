package _01_Array;
//sorting 2d

import java.util.Scanner;

public class Problem_39 {

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
	
	public static void be_sor_displayArr(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+"  ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
public static void sortingArr(int arr[][])
{
	for(int a=0;a<arr.length;a++)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					for(int l=j+1;l<arr.length;l++)
					{
						int temp=0;
					    if(arr[i][j]>arr[k][l])
					       {
						    temp=arr[k][l];
						    arr[k][l]=arr[i][j];
						    arr[i][j]=temp;
					       }
					    else
					    {
					    	arr[i][j]=arr[i][j];
					    }
					}
				}
			}
		}
	}
}
	
public static void af_sor_displayArr(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+"  ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
   }
	
	
public static void main(String[] arg)
	{
		int arr[][]=new int[2][2];
		inputArr(arr);
		be_sor_displayArr(arr);
		sortingArr(arr);
		af_sor_displayArr(arr);
	}
}
