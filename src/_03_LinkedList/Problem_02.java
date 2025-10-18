package _03_LinkedList;
//WAP to reverce linkedlist nodes
public class Problem_02 {
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
	public static void Displayrev(Node head) {
		if(head == null) return;
		Displayrev(head.next);
		System.out.print(head.data+" ");
	}
	public static void main(String[] arg) {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		Display(a);
		Displayrev(a);
	}

}
