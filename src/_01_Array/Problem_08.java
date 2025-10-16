package _01_Array;
//Wap to replace all odd element by qube size 8
public class Problem_08 {
	public static void main(String[] arg)
	{
	int arr[]=new int[] {1,2,3,4,5,6,7,8};
	//display
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.println();
	//Qube
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			int sq=arr[i]*arr[i]*arr[i];
		System.out.print(sq+",");
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
}
}
