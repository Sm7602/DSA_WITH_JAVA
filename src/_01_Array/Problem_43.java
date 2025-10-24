package _01_Array;

public class Problem_43 {
	public static void SelectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<arr.length-1;i++) {
			int minind=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minind]>arr[j]) {
					minind=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minind];
			arr[minind]=temp;
		}
	}
	public static void main(String[] arg) {
		int arr[]=new int[] {21,10,1,22,2,5,7,18};
		SelectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
