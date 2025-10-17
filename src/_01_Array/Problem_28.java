package _01_Array;

//WAp to mul all element of 2d arr size 4,4

import java.util.Scanner;

public class Problem_28 {
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
	
	public static void mulArr(int arr[][])
	{
		int s=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				s *=arr[i][j];
			
			}
			System.out.println("\n");
		}
		System.out.println("mul of 2D arr : "+s);
	}
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		mulArr(arr);
	}


}
