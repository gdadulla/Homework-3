package Homework3;

public class Node {
	
		private String name;
		private Node next;
		private Node prev;
		
		public Node(String name){
			this.name = name;
			this.next = null;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
 
		public void setNext(Node node){
			this.next = node;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setPrev(Node node){
			this.prev = node;
		}
		
		public Node getPrev(){
			return prev;
		}
		
		public String toString() {
			return "Name " + this.name;
		}
}
