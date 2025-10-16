package _01_Array;
//WApP to add all even and odd elemrnts of Sda size 8
public class Problem_11 {
	public static void main(String[] arg)
	{
	int arr[]=new int[] {1,2,3,4,5,6,2,8};
	//display
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.println();
	//add
	int oc=0;
	int ec=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			oc+=arr[i];
		}
		else {
			ec+=arr[i];
		}
	}
	System.out.println("odd : "+oc+"\neven : "+ec);
	}

}
