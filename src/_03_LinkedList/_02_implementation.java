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
		//add data in likedlist
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
		//add data in head
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
		//add data by index
		void addAt(int index,int data) {
			Node newdata=new Node(data);
			Node temp=head;
			for(int i=1;i<=index-1;i++) {
				temp=temp.next;
			}
			newdata.next=temp.next;
			temp.next=newdata;
		}
		//add data in tail
		void addLast(int data) {
			add(data);
		}
		// size of linkedlist
		int length() {
			Node temp=head;
			int c=0;
			while(temp !=null) {
				c++;
				temp=temp.next;
			}
			return c;
		}
		//remove first data
		void removeFrist() {
			head=head.next;
		}
		//remove last data
		void removeLast() {
			Node temp=head;
			while(temp.next.next != null) {
				temp=temp.next;
			}
			temp.next=null;
		}
		//remove all data
		void removeAll() {
			head=null;
			tail=null;
		}
		//remove  node by node val
		void removeNode(Node node ) {
			node.data=node.next.data;
			node.next=node.next.next;
		}
		//remove index data
		void removeAt(int index) {
			Node temp=head;
			for(int i=1;i<=index-1;i++) {
				temp=temp.next;
			}
			temp.data=temp.next.data;
			temp.next=temp.next.next;
		}
		//remove data by val
		void remove(int data) {
			Node temp=head;
			while(temp!=null) {
				if(temp.data==data) {
					temp.data=temp.next.data;
					temp.next=temp.next.next;
				}else {
				temp=temp.next;
				}
			}
		}
		//revarce linkedlist
		void revarce(Node head) {
			if(head == null) return;
			revarce(head.next);
			System.out.print(head.data+" ");
		}
		//sorting of linked list
		void sort() {
			Node h=head;
			for(int j=1;j<length();j++) {
				for(int i=1;i<length();i++) {
					if(h.data>h.next.data) {
						int temp=h.next.data;
						h.next.data=h.data;
						h.data=temp;
					}
					else {
						h.data=h.data;
					}
					h=h.next;
				}
				h=head;
			}
			
		}
		//find data by index
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
		//find data by val
		boolean searchbyVal(int data) {
			Node temp=head;
			boolean b=false;
			while(temp!=null) {
				if(data==temp.data) {
					b=true;
				}
				temp=temp.next;
			}
			return b;
		}
	
		//display
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
//		ll.removeNode(ll.head.next.next.next);
//		ll.remove(7);
//		ll.display();
		System.out.print(ll.length());
		System.out.println();
//		ll.revarce(ll.head);
//		System.out.print(ll.search(8));
		ll.sort();
		ll.display();
		System.out.print(ll.searchbyVal(10));
		
	
	}

}
