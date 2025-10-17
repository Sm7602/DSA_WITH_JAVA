package _02_String;

import java.util.Scanner;

//count small word

public class Problem_07 {
	
	public static String input()
	{
		Scanner sc= new Scanner(System.in);
		String  str;
		
		System.out.print("Enter :  ");
		str= sc.nextLine();
		
		return str;
	}
	
	 public static void countSmallWords(String str)
	 {
		 int l=0; 
		 int sl=0;
		 int sw=0;
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)!=' ')
			 {
			     l++;
			        if(str.charAt(i) >='a'&&str.charAt(i) <='z')
				     {
					    sl++;
				     }
			 } 
			 
			 if(str.charAt(i)==' ' || i==str.length()-1)
			 { 
				
		       if ( l == sl)
				   { 
				       sw++;
				    }
				    l = 0; 
				    sl = 0;
			 }
			 
		 }
		 System.out.println();
		 
		 System.out.print(sw);
		  
		
	 }
	       

	
	public static void main(String[] arg)
	{
	    String str=input();
	    countSmallWords(str);
	  
	}

}
