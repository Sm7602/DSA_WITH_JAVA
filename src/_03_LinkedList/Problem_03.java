package _03_LinkedList;
// find the length of likedlist
public class Problem_03 {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	public static void Display(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void length(Node head) {
		int c=0;
		while(head != null) {
			c++;
			head=head.next;
		}
		System.out.println(c);
	}
	public static void main(String[] arg) {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(6);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		Display(a);
		length(a);
	}

}
