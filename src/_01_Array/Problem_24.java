package _01_Array;

import java.util.Scanner;

//insetion of a arr

public class Problem_24 {
	
	public static void inputArr(int arra[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arra.length;i++)
		{
			System.out.print("Value of arr["+i+"] : ");
			arra[i]=sc.nextInt();
		}
		System.out.println("\n");
	}
	
	public static void be_in_displayArr(int arra[])
	{
		for(int i=0;i<arra.length;i++)
		{
			System.out.print(arra[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void insertingArr(int arra[],int arrb[])
	{
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("index : ");
		int index=sc.nextInt();
		System.out.print("insert arr["+index+"] : ");
		int n=sc.nextInt();
		
		arra[index]=n;
		
		for(int i=0;i<arrb.length;i++)
		{
			if(i<index)
			{
			arrb[i]=arra[i];
			}
			else if(i== index)
			{
				arrb[i]=arra[index];
			}
			else
			{
				arrb[i]=arra[i-1];
			}
		}
	}
	
	public static void af_in_displayArr(int arrb[])
	{
		for(int i=0;i<arrb.length;i++)
		{
			System.out.print(arrb[i]+" ");
		}
	}
	

	public static void main(String[] arg)
	{
		int arra[]=new int[5];
		int arrb[]=new int[6];
		inputArr(arra);
		be_in_displayArr(arra);
		insertingArr(arra,arrb);
		af_in_displayArr(arrb);
		
	}
}
