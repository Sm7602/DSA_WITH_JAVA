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
		void addAt(int index,int data) {
			Node newdata=new Node(data);
			Node temp=head;
			for(int i=1;i<=index-1;i++) {
				temp=temp.next;
			}
			newdata.next=temp.next;
			temp.next=newdata;
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
		void removeNode(Node node ) {
			node.data=node.next.data;
			node.next=node.next.next;
		}
		void removeAt(int index) {
			Node temp=head;
			for(int i=1;i<=index-1;i++) {
				temp=temp.next;
			}
			temp.data=temp.next.data;
			temp.next=temp.next.next;
		}
		void revarce(Node head) {
			if(head == null) return;
			revarce(head.next);
			System.out.print(head.data+" ");
		}
		void sort() {
			
				for(int i=1;i<length();i++) {
					if(head.data>head.next.data) {
						int temp=head.next.data;
						head.next.data=head.data;
						head.data=temp;
					}
					else {
						head.data=head.data;
					}
					head=head.next;
				}
			
		}
		boolean search(int index) {
			Node temp=head;
			boolean b=false;
			int c=0;
			while(temp!=null) {
				if(c==index) {
					b=true;
				}
				temp=temp.next;
				c++;
			}
			
			return b;
		}
		void display() {
			Node temp=head;
			while(temp !=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] arg) {
		LinkedList ll=new LinkedList();
		ll.add(7);
		ll.add(2);
		ll.add(31);
		ll.addLast(1);
		ll.addFrist(9);
		ll.addFrist(10);
		ll.display();
		ll.addAt(3,5);
		ll.display();
//		ll.sort();
//		ll.display();
//		ll.removeAt(1);
//		ll.removeAt(3);
//		ll.display();
//		ll.removeFrist();
//		ll.display();
//		ll.removeLast();
//		ll.display();
//		ll.removeAll();
//		 ll.removeNode(ll.head.next.next.next);
//		 ll.display();
		System.out.print(ll.length());
//		ll.revarce(ll.head);
		System.out.print(ll.search(8));
	
	}

}
