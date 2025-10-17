package _02_String;
 
//find duplicate charactar
public class Problem_13 {
	public static void duplicateFind(String str1 )
	{
		for(int i=0;i<str1.length()-1;i++)
		{ 
			int c=0;
			if(str1.charAt(i) !=' ')
			{
				for(int j=i;j<str1.length();j++)
				{
					if(str1.charAt(j)==str1.charAt(i))
					{
						c++;
					}
				}
				if(c>1)
				{
					System.out.println(" num of  "+str1.charAt(i)+" : "+c);
				}
			}
		}
	}
	public static void main(String[] arg)
	{
		String str1="Ram io a boy";

		System.out.println(str1);
		
		duplicateFind(str1);
		

	}

}
