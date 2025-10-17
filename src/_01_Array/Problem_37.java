package _01_Array;

// prime number in 2da

import java.util.Scanner;

public class Problem_37 {
	
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
	
	public static void primeArr(int arr[][])
	{
		int pc=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int c=0;
			 for(int k=2;k<arr[i][j];k++)
			 {
		
				 if(arr[i][j] % k==0)
				 {
					 c++;
				 }
			 }
			 if(c==0)
			 {
				 pc++;
				 System.out.print(arr[i][j]+"  "); 
			 }
			  
			}
			System.out.println("\n");
		}
		
		System.out.print("Total prime : "+pc);
		System.out.println("\n");
	  }	
	
	public static void main(String[] arg)
	{
		int arr[][]=new int[4][4];
		inputArr(arr);
		primeArr(arr);
	}

}
