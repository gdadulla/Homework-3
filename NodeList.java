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
	     
	   public boolean findString(String s){
	        Node currentNode = head; 
	        while(currentNode.getName() != s){
	        	currentNode = currentNode.getNext();
	        	if(currentNode.getName()== s){
	        		System.out.println(s + " is in list");
	        		return true;
	        	}
	        	if(currentNode.getName() != s && currentNode.getNext() == null){
	        		System.out.println(s + " is not in list");
	        		return false;
	        	}
	        }
	   return true;  	
	   }	   
}
