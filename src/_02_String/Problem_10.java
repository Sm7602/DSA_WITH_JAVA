package _02_String;

import java.util.Scanner;

public class Problem_10 {
	public static String input()
	{
		Scanner sc= new Scanner(System.in);
		String  str;
		
		System.out.print("Enter :  ");
		str= sc.nextLine();
		
		return str;
	}
	public static void toMyLowercase(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >='A'&&ch <='Z')
			{
				ch=(char)(ch-32);
			}
			System.out.print(ch);
		}
	
		
	}
	public static void main(String[] arg)
	{
		String str=input();
		toMyLowercase(str);	
	}

}
