package _01_Array;
//WAP to display all element even position in sda size 8
public class Problem_05 {
   public static void main(String[] arg)
   {
	   int arr[]=new int[] {1,2,3,4,5,6,7,8};
	   //display
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+",");
	   }
	   System.out.println();
	   //even position
	   for(int i=0;i<arr.length;i++) {
		   if(i%2==0) {
		   System.out.print(arr[i]+",");
		   }
	   }
   }
}
