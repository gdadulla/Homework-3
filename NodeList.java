package Homework3;

public class NodeList {
	
	//instance variables
	private int size;
	private Node head = null;
	private Node tail;
	
	//add method that adds nodes alphabetically to list, has parameter String name
	public void add(String name){
		Node current = head;
		Node newNode = new Node(name);
		
		//if list is empty
		if(head == null){
			head = tail = newNode; //head and tail = new node
		} 
		
		//if head and tail are the same
		else if (head == tail){
			
			//compares name to head if name should be before head then set accordingly
			if(name.compareTo(head.getName()) <= 0){
				head = newNode;
				head.setNext(tail);
				tail.setPrev(head);
				size++;
			}
			//else then newNode becomes tail
			else{ 
				tail = newNode;
				head.setNext(tail);
				tail.setPrev(head);
				size++;
			}
		}
		
		//if two or more nodes in list
		else{
			Node temp = position(name);
			
			//if temp is head set newNode to head
			if(temp == head){
				head.setPrev(newNode);
				newNode.setNext(head);
				head = newNode;
				size++;
			}
			
			//if temp is null set newNod to tail
			else if(temp == null){
				tail.setNext(newNode);
				newNode.setPrev(tail);
				tail = newNode;
				size++;
			}
			
			//if temp is between head and tail
			else{
				newNode.setNext(temp);
				newNode.setPrev(temp.getPrev());
				temp.getPrev().setNext(newNode);
				temp.setPrev(newNode);
				size++;
			}
		}
	}
	
	//method size that returns size
	public int size(){
		return size;
	}
	
	//printForward method that traverses the list forward and prints
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
	
	//printBackward method that traverses the list backward and prints
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
	
	//find method that searches the list for a string
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
	
	//delete method that searches the list for node then delete
	public void delete(String n){
		   Node temp = head;
		   Node tempprev = null;
		  
		   //if the parameter is null or if list is empty
		   if(n == null || head == null){
			   return;
		   }
		   
		   //if n is head
		   if(head.getName().compareTo(n) == 0){
			   head = head.getNext();
			   head.setPrev(null);
			   head.setNext(head.getNext());
			   this.size --;
			   return;
		   }
		
		   //if n is tail
		   if(tail.getName().compareTo(n) == 0){
			   tail = tail.getPrev();
			   tail.setNext(null);
			   tail.setPrev(tail.getPrev());
			   this.size --;
			   return;
		   }
		   
		   //while loop that goes through list
		   while(temp.getNext() != null){
				   
			   tempprev = temp;
			   temp = temp.getNext();
			   
			   //if temp.getName is equal to name
			   if(temp.getName().compareTo(n) == 0){
				   tempprev = temp.getPrev();
				   temp = temp.getNext();
				   tempprev.setNext(temp);
				   temp.setPrev(tempprev);
				   this.size--;
				   return;
			   }
				   
		   }
		   
}
	   
	//position method that returns node if temp is equal to name
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
	   
	//destroy method that removes the whole list
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