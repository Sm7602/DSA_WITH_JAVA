package _03_LinkedList;
//insert node in linkedlist
public class Problem_04 {
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
	public static Node insertAtHead(Node head,int data) {
		Node newdata=new Node(data);
		newdata.next=head;
		return newdata;
	}
	public static Node insertAtTail(Node head,int data) {
		Node newdata=new Node(data);
		if(head == null) {
			return newdata;
		}
		  Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newdata;
	        return head; 
		
	}
	public static void main(String [] arg) {
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
		System.out.println();
		a=insertAtHead(a,0);
		Display(a);
		System.out.println();
		a=insertAtTail(a,0);
		Display(a);
		
		
	}

}
