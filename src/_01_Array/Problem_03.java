package _01_Array;
//WAP to multiply all elements of sda size 12
public class Problem_03 {
	public static void main(String[] arg) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		//dispaly
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		//multiply
		int mul=1;
		for(int i=0;i<arr.length;i++) {
			mul *=arr[i];
		}
		System.out.print("MUltiply all : "+mul);
	}

}
