package _01_Array;
//Wap to find count even and odd elements in SDA size 8
public class Problem_10 {
	public static void main(String[] arg)
	{
	int arr[]=new int[] {1,2,3,4,5,6,2,8};
	//display
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.println();
	//count
	int oc=0;
	int ec=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			oc++;
		}
		else {
			ec++;
		}
	}
	System.out.println("odd : "+oc+"\neven : "+ec);
	}

}
