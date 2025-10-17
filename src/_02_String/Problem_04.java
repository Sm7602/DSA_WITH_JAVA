package _02_String;

import java.util.Scanner;

//count small leter

public class Problem_04 {
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
			if(str.charAt(i) >='a'&&str.charAt(i) <='z')
			{
				System.out.println(str.charAt(i));
				c++;
			}
		}
		System.out.println("Total Small leter : "+c);
	}
	
	public static void main(String[] arg)
	{
	    String str=input();
		count(str);
	}

}
