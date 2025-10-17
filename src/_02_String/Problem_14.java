package _02_String;
//common charactor  two string

public class Problem_14 {
	
	public static void commonChar(String str1,String str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			int c=0;
			if(str1.charAt(i) !=' ')
			{
				for(int j=0;j<str2.length();j++)
				{ 
						if(str1.charAt(i)==str2.charAt(j))
						{
							c++;
						}
					 
				}
				if(c>0)
				{
					System.out.println("Common char : "+str1.charAt(i));
				}
			}
		}
	}
	public static void main(String[] arg)
	{
		String str1="Ram is a boy";
		String str2="Sam  not a girl";
		
		commonChar(str1,str2);
	}

}
