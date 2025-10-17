package _02_String;

import java.util.Scanner;

public class Problem_12 {
	
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("Enter :  ");
		str=sc.nextLine();
		
		return str;
	}
	
	public static void reverse(String str)
	{
		int n=  str.length();
		 for(int i=str.length()-1;i>0;i--)
		 {
		     
			 if(str.charAt(i)==' ')
			 {
			      for(int j=i;j<n;j++)
			       {
				     System.out.print(str.charAt(j));
			        }
			      n=i;
		      }
		 }
		 
		 System.out.print(" ");
		 
		 for(int k=0;k<n;k++)
		 {
			 System.out.print(str.charAt(k));
		 }
		 
		
	}
	
	public static void main(String[] arg)
	{
	    String str=input();
       reverse(str);
	}

}
