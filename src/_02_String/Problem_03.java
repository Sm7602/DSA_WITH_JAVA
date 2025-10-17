package _02_String;

import java.util.Scanner;
//count vaowel
public class Problem_03 {
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("Enter : ");
		str=sc.nextLine();
		
		return str;
	}
	
	public static void vaowel(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) =='A' ||str.charAt(i) =='E' ||str.charAt(i) =='I' ||str.charAt(i) =='O'
					|| str.charAt(i) =='U' || str.charAt(i) =='a'||str.charAt(i) =='e' 
					||str.charAt(i) =='i' ||str.charAt(i) =='o' ||str.charAt(i) =='u')
			{
				System.out.println(str.charAt(i));
				c++;
			}	
		}
		System.out.println("Total vawel : "+c);
	}
	public static void main(String[] arg)
	{
	    String str=input();
		vaowel(str);
	}

}
