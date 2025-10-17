package _02_String;

import java.util.Scanner;

public class Problem_02 {
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("Enter : ");
		str=sc.nextLine();
		return str;
	}
	public static void count(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			if(str.charAt(i) != ' ')
			{
				c++;
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] arg)
	{
	    String str=input();
		count(str);
	}

}
