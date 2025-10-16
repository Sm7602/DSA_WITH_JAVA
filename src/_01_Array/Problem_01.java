package _01_Array;

import java.util.Scanner;

//wap to input & display  elemrnt of SDA size 15
public class Problem_01 {
	public static void main(String[] arg)
	{
		int arr[]=new int[15];
		Scanner sc=new Scanner(System.in);
		//input
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		//Display
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
