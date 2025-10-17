package _01_Array;
// scearcing

import java.util.Scanner;

public class Problem_38 {
	
	public static void inputArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print("value of arr["+i+"]["+j+"]  : ");
			arr[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public static void serchArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int j=0;
		System.out.print("enter row :  ");
		i=sc.nextInt();
		System.out.print("enter column :  ");
		j=sc.nextInt();
		System.out.println("arr["+i+"]["+j+"] vlaue is : "+arr[i][j]);
		
		System.out.println("\n");
	}
	
	public static void searchPositionArr(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value :  ");
		int n=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
		     if(n == arr[i][j])
		        {
		           System.out.println("position is arr["+i+"]["+j+"]");
			    }
		    }
	    }

	}
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		serchArr(arr);
		searchPositionArr(arr);
	}

}
