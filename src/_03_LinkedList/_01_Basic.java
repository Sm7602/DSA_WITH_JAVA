package _03_LinkedList;

public class _01_Basic {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static void main(String [] arg) {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		System.out.println(e.next.data);
		
	}

}
