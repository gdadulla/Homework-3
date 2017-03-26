package Homework3;

public class NodeList {

	private int size;
	private Node head = null;
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
	     
	   public boolean find(String s){
	        Node currentNode = head; 
	        while(currentNode.getName() != s){
	        	currentNode = currentNode.getNext();
	        	if(currentNode.getName().equals(s)){
	        		System.out.println(s + " is in list");
	        		return true;
	        	}
	        	if(currentNode.getName() != s && currentNode.getNext() == null){
	        		System.out.println(s + " is not in list");
	        		return false;
	        	}
	        }
	   return false;  	
	   }	   
	   
	   public void delete(Node n){
		   Node temp = head;
		   Node tempprev = null;
		   if(n == null){
			   return;
		   }
		   if(size == 1){
			   this.head = this.tail = null;
			   this.size --;
			   return;
		   }
		   if(head == n){
			   head = head.getNext();
			   head.setPrev(null);
			   head.setNext(head.getNext());
			   this.size --;
			   return;
		   }
		   if(tail == n){
			   tail = tail.getPrev();
			   tail.setNext(null);
			   tail.setPrev(tail.getPrev());
			   this.size --;
			   return;
		   }
		   while(temp.getNext() != null){
				   
			   tempprev = temp;
			   temp = temp.getNext();
			   if(temp.getName().equals(n.getName())){
				   tempprev = temp.getPrev();
				   temp = temp.getNext();
				   tempprev.setNext(temp);
				   temp.setPrev(tempprev);
				   this.size--;
				   return;
			   }
				   
		   }
		   
}
}