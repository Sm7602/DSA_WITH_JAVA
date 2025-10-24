package _03_LinkedList;
import _03_LinkedList._02_implementation.LinkedList;
import _03_LinkedList._02_implementation.Node;
// selection sort
public class Problem_08 {
	public static void selectionSort(Node head) {
		 for (Node i = head; i != null; i = i.next) {
	            Node min = i; 
	            for (Node j = i.next; j != null; j = j.next) {
	                if (j.data < min.data) {
	                    min = j;
	                }
	            }
	            int temp = i.data;
	            i.data = min.data;
	            min.data = temp;
	        }
	}
	public static void main(String[] arg) {
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(10);
		ll.add(1);
		ll.add(22);
		ll.add(2);
		ll.add(5);
		
		ll.display();
		selectionSort(ll.head);
		ll.display();
	}
}
