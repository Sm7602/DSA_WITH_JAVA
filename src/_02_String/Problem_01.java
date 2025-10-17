package _02_String;

import java.util.Scanner;

public class Problem_01 {
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String value : ");
		str=sc.nextLine();
		return str;
	}
	public static void display(String str)
	{
		System.out.print("String value : "+str);
	}
	public static void main(String[] arg)
	{
	    String str=input();
		display(str);
	}

}
