package _01_Array;

//Wap to find count even and odd elements in SDA size 8

import java.util.Scanner;

public class Problem_11 {
	
	public static void inputArr(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Value of arr["+i+"]  : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n");
	}
	
	public static void displayArr(int arr[])
	{
		int ec=0;
		int oc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
				ec++;
			}
			else
			{ 
				oc++;
			}
		}
		System.out.println("even : "+ec+" \n"+"odd : "+oc);
	}
	
	public static void main(String [] arg)
	{
		int arr[]=new int[8];
		inputArr(arr);
		displayArr(arr);
		
	}

}
