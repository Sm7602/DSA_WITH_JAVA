package _03_LinkedList;

//display a linkedlist
public class Problem_01 {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp !=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
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
		
//        System.out.print(a.data+" ");
//        System.out.print(b.data+" ");
//        System.out.print(c.data+" ");
//        System.out.print(d.data+" ");
//        System.out.print(e.data+" ");
		
//		  System.out.print(a.data+" ");
//        System.out.print(a.next.data+" ");
//        System.out.print(b.next.data+" ");
//        System.out.print(c.next.data+" ");
//        System.out.print(d.next.data+" ");
		
//		  System.out.print(a.data+" ");
//        System.out.print(a.next.data+" ");
//        System.out.print(a.next.next.data+" ");
//        System.out.print(a.next.next.next.data+" ");
//        System.out.print(a.next.next.next.next.data+" ");

//		Node temp=a;
//		for(int i=0;i<5;i++) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
		
		display(a);
	}

}
