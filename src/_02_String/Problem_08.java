package _02_String;
import java.util.Scanner;

//capital word count

public class Problem_08 {
	
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("Enter :  ");
		str=sc.nextLine();
		
		return str;
	}
	
	public static void countCapitalWord(String str)
	{
		int l=0;
		int cl=0;
		int cw=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') 
			{
				l++;
				if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				{
					cl++;
				}
			}
			
			if(str.charAt(i)==' ' || i==str.length()-1)
			{
				if(l==cl)
				{
					cw++;
				}
				
				cl=0;
				l=0;
			}
		}
		
		System.out.println(cw);
	}
	
	
	public static void main(String[] arg)
	{
	 
		String str=input();
		countCapitalWord(str);

	}
}
