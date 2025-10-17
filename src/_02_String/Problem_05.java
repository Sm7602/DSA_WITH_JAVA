package _02_String;

import java.util.Scanner;

//count capital leter

public class Problem_05 {
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
			if(str.charAt(i) >='A'&&str.charAt(i) <='Z')
			{
				System.out.println(str.charAt(i));
				c++;
			}
		}
		System.out.println("Total Capital leter : "+c);
	}
	
	public static void main(String[] arg)
	{
	    String str=input();
		count(str);
	}

}
