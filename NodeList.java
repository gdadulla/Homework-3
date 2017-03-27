package Homework3;

public class NodeList {

	private int size;
	private Node head = null;
	private Node tail;
	
	public void add(String name){
		Node current = head;
		Node newNode = new Node(name);
		if(head == null){
			head = tail = newNode;
		} 
		
		else if (head == tail){
			if(name.compareTo(head.getName()) <= 0){
				head = newNode;
				head.setNext(tail);
				tail.setPrev(head);
			}
			else{
				tail = newNode;
				head.setNext(tail);
				tail.setPrev(head);
			}
		}
		else{
			Node temp = position(name);
			
			if(temp == head){
				head.setPrev(newNode);
				newNode.setNext(head);
				head = newNode;
			}
			else if(temp == null){
				tail.setNext(newNode);
				newNode.setPrev(tail);
				tail = newNode;
			}
			else{
				newNode.setNext(temp);
				newNode.setPrev(temp.getPrev());
				temp.getPrev().setNext(newNode);
				temp.setPrev(newNode);
			}
		}
	}
	
	public int size(){
		return size;
	}
	
	 public void printForward(){
	        Node temp = head;
	        if(temp == null){
	        	System.out.println("List is empty");
	        }
	        while(temp != null){
	            System.out.println(temp);
	            temp = temp.getNext();
	        }
	    }
	
	 public void printBackward(){
	        Node temp = tail;
	        if(temp == null){
	        	System.out.println("List is empty");
	        }
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
	   
	   public void delete(String n){
		   Node temp = head;
		   Node tempprev = null;
		   if(n == null){
			   return;
		   }
		   
		   if(head.getName().compareTo(n) <= 0){
			   head = head.getNext();
			   head.setPrev(null);
			   head.setNext(head.getNext());
			   this.size --;
			   return;
		   }
		   
		   if(tail.getName().compareTo(n) <= 0){
			   tail = tail.getPrev();
			   tail.setNext(null);
			   tail.setPrev(tail.getPrev());
			   this.size --;
			   return;
		   }
		   while(temp.getNext() != null){
				   
			   tempprev = temp;
			   temp = temp.getNext();
			   if(temp.getName().compareTo(n) <= 0){
				   tempprev = temp.getPrev();
				   temp = temp.getNext();
				   tempprev.setNext(temp);
				   temp.setPrev(tempprev);
				   this.size--;
				   return;
			   }
				   
		   }
		   
}
	   
	   public Node position(String name){
		   Node temp = head;
		   while (temp != null){
			   if(name.compareTo(temp.getName()) <= 0){
				   return temp;
			   }
			   temp = temp.getNext();
		   }
		   return null;
	   }
	   public void destroy(){
		   Node current = head;
		   Node next = null;
		   
		   while(current != null){
			   next = current.getNext();
			   current = next;
			   size--;
		   }
		   head = null;
		   
		   }
		   
}