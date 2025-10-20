package _03_LinkedList;
//delete node form Linked list
public class Problem_05 {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void Display(Node head) {
		while(head !=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static Node deleteatHead(Node head) {
		return head.next;
	}
	public static Node deleteatTail(Node head) { 
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	public static Node deleteatAll(Node head) {
		return head=null;
	}
	public static void main(String [] arg) {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		Node f=new Node(6);
		Node g=new Node(7);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		
		Display(a);
		System.out.println();
		a=deleteatHead(a);
		Display(a);
		System.out.println();
		a=deleteatTail(a);
		Display(a);
		System.out.println();
//		a=deleteatAll(a);
		Display(a);
		System.out.println("jgrehguhrgu");
		
	}

}
