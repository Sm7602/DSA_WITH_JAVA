package _01_Array;
//insertion sort
public class Problem_44 {
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			 while (j >= 0 && arr[j] > key) {
				   arr[j+1]=arr[j];
				   j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String [] arg) {
		int arr[]=new int[] {21,10,5,1,6,2,7,3};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
