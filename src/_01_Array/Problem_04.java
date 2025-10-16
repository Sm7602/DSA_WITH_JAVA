package _01_Array;
//WAP to display squre of all element sda size 8
public class Problem_04 {
	public static void main(String[] arg)
	{
		int arr[]=new int[] {1,2,3,4,5,6,7,8};
		//diplay
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		//squre
		for(int i=0;i<arr.length;i++) {
			int sq=arr[i]*arr[i];
			System.out.print(sq+",");
		}
	}

}
