package _02_String;

import java.util.Scanner;

//count word

public class Problem_06 {
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("Enter :  ");
		str=sc.nextLine();
		
		return str;
	}
	
	public static void count(String str)
	{
		System.out.println(str);
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' || i==str.length()-1)
			{
				c++;
			}
		}	
		System.out.println("Total WORD : "+c);
	}
	
	public static void main(String[] arg)
	{
	    String str=input();
		count(str);
	}
	

}
