package Homework3;


public class NodeList {

	private int size;
	private Node head;
	private Node tail;
	
	public void add(Node n){
		Node newNode = new Node(n.getName());
		if(head == null){
			head = newNode;
			tail = head;	
		}
		else{
			tail.setNext(n);
			n.setPrev(tail);
			n.setNext(null);
			tail = n;
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
	 public void printForward(){
	        Node temp = head;
	        while(temp != null){
	            System.out.println(temp);
	            temp = temp.getNext();
	        }
	    }
	
	 public void printBackward(){
	        Node temp = tail;
	        while(temp != null){
	            System.out.println(temp);
	            temp = temp.getPrev();
	        }
	    }
	     
}
