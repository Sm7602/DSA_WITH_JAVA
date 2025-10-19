package _03_LinkedList;

public class _02_implementation {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public static class LinkedList{
		Node head;
		Node tail;
		void add(int data) {
			Node newdata=new Node(data);
			if(head==null){
				head=newdata;
				tail=newdata;
			}else {
				tail.next=newdata;
			}
			tail=newdata;
		}
		void addFrist(int data) {
			Node newdata=new Node(data);
			if(head==null){
				head=newdata;
				tail=newdata;
			}else {
				 newdata.next=head;
			}
			 head=newdata;
		}
		void addLast(int data) {
			add(data);
		}
		int length() {
			Node temp=head;
			int c=0;
			while(temp !=null) {
				c++;
				temp=temp.next;
			}
			return c;
		}
		void removeFrist() {
			head=head.next;
		}
		void removeLast() {
			Node temp=head;
			while(temp.next.next != null) {
				temp=temp.next;
			}
			temp.next=null;
		}
		void removeAll() {
			head=null;
			tail=null;
		}
		void revarce(Node head) {
			if(head == null) return;
			revarce(head.next);
			System.out.print(head.data+" ");
		}
		void display() {
			Node temp=head;
			while(temp !=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] arg) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.addLast(4);
		ll.addFrist(0);
		ll.addFrist(1);
		ll.display();
//		ll.removeFrist();
//		System.out.println();
//		ll.display();
//		System.out.println();
//		ll.removeLast();
//		ll.display();
//		ll.removeAll();
		System.out.print("\n"+ll.length());
		ll.revarce(ll.head);
	}

}
