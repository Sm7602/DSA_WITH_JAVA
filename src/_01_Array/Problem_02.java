package _01_Array;
//WAP to add all elements of SDA size 8
public class Problem_02 {
	public static void main(String[] arg)
	{
		int arr[]=new int[] {1,2,3,4,5,6,7,8};
		int sum=0;
		//display
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		//sum
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		System.out.println("sum of arr : "+sum);
	}

}
