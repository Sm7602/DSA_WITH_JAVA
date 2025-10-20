package _03_LinkedList;
// Delete node with node as given parameter
public class Problem_06 {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void display(Node head) {
		while(head !=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void Deletenode(Node node) {
		node.data=node.next.data;
		node.next=node.next.next;
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
		display(a);
		Deletenode(c);
		display(a);
		
	}

}
