package _03_LinkedList;
import _03_LinkedList._02_implementation.LinkedList;
import _03_LinkedList._02_implementation.Node;
//odd & even value 
public class Problem_07 {
	public static void odd(Node head) {
		Node temp=head;
		while(temp != null) {
			if(temp.data %2 !=0) {
				System.out.print(temp.data+" ");
			}
			temp=temp.next;
		}
	}
	public static void even(Node head) {
		Node temp=head;
		while(temp != null) {
			if(temp.data %2 ==0) {
				System.out.print(temp.data+" ");
			}
			temp=temp.next;
		}
	}
	public static void main(String[] arg) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(5);
		ll.add(2);
		ll.add(4);
		ll.add(8);
		ll.add(3);
		ll.add(6);
		ll.display();
		odd(ll.head);
		even(ll.head);
		
	}

}
